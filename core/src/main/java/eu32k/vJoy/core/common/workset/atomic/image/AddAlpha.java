package eu32k.vJoy.core.common.workset.atomic.image;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import eu32k.vJoy.core.common.AdvancedShader;
import eu32k.vJoy.core.common.Tools;
import eu32k.vJoy.core.common.workset.ImagePort;
import eu32k.vJoy.core.common.workset.atomic.ImageInstance;
import eu32k.vJoy.core.common.workset.atomic.ImageType;

public class AddAlpha extends ImageType {

   private ImagePort imageA = addPort(new ImagePort("Image A"));
   private ImagePort imageB = addPort(new ImagePort("Image B"));

   public AddAlpha() {
      super("Add Alpha");
   }

   @Override
   public ImageInstance instanciate(float x, float y) {
      return new ImageInstance(this, x, y) {

         private AdvancedShader shader = Tools.getShader("stack");

         @Override
         public void renderInternally() {
            renderPort(imageA);
            renderPort(imageB);

            Gdx.gl.glActiveTexture(GL20.GL_TEXTURE1);
            getPortValue(imageB).bind();

            Gdx.gl.glActiveTexture(GL20.GL_TEXTURE0);
            getPortValue(imageA).bind();

            shader.begin();

            shader.setUniformi("uTexture2", 1);
            shader.setUniformi("uTexture1", 0);

            shader.renderToQuad(frameBuffer);
         }
      };
   }
}