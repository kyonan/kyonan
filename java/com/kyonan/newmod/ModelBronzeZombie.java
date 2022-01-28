package com.kyonan.newmod;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelBronzeZombie extends ModelBase {
    public ModelRenderer base;

    public ModelBronzeZombie() {
        super();
        textureWidth = 32;
        textureHeight = 16;
        base = new ModelRenderer(this, 0, 0);
        base.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3,float f4, float f5) {
        base.render(f5);
    }
}
