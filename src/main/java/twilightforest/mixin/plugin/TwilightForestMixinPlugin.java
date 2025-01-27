package twilightforest.mixin.plugin;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import twilightforest.mixin.plugin.patches.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TwilightForestMixinPlugin implements IMixinConfigPlugin {
    private List<Patch> patches;
    @Override
    public void onLoad(String mixinPackage) {
        patches = new ArrayList<>();
        patches.add(new LevelPatch());
        patches.add(new ServerLevelPatch());
        patches.add(new ServerLevelPatchStart());
        patches.add(new ServerLevelPatchEnd());
//        patches.add(new ServerLevelEntitycallbackPatch());
        patches.add(new ServerEntityPatch());
        patches.add(new EntityRenderDispatcherPatch());
        patches.add(new MapItemPatch());

//        patches.add(new LevelRendererPatch());
//        patches.add(new ItemInHandRenderPatch());
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if(mixinClassName.contains("BoundingBoxMixin") || mixinClassName.contains("WorldGenRegionMixin"))
            return FabricLoader.getInstance().isDevelopmentEnvironment() ? true : false;
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    private boolean warned = false;

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        if(!warned) {
            warned = true;
            System.out.println("PATCHING CLASSES");
        }

        for(Patch patch : patches) {
            //System.out.println(patch.getMixinClass() + " "+targetClassName.equals(patch.getMixinClass()) + " : " + targetClassName);
            patch.applyClass(targetClass);
            //System.out.println(patch.getMixinClass() + " : "+ patch.getMethodName()+patch.getMethodDesc());
            if(patch.getMixinClass().equals(targetClassName)) {
                System.out.println("PATCHING CLASS: "+ targetClassName);
                for(MethodNode node : targetClass.methods) {
//                    if(targetClassName.contains("class_898")) {
//                        System.out.println(node.name+node.desc);
//                    }

                    //System.out.println(node.desc);
                    //System.out.println(patch.getMixinClass() +" : " + patch.getMethodName()+patch.getMethodDesc() + " : " +node.name + " : "+ node.desc);
                    if(node.name.equals(patch.getMethodName()) && node.desc.equals(patch.getMethodDesc())) {
                        System.out.println("PATCHING METHOD: "+ node.name+node.desc);
                        patch.applyMethod(node);
                    }
                }
            }
        }
    }
}
