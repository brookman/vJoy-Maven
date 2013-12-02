package eu32k.vJoy.core.architect;

import com.badlogic.gdx.scenes.scene2d.ui.Window;

import eu32k.vJoy.core.VJoyMain;
import eu32k.vJoy.core.common.workset.DataType;
import eu32k.vJoy.core.common.workset.Port;

public class PortView extends Window {

   private Port port;

   public PortView(Port port) {
      super(port.getName(), VJoyMain.SKIN);
      this.port = port;
      setMovable(false);
   }

   public void update() {
      setTitle(port.getName());
      setColor(DataType.NORMAL_COLORS[port.getDataType()]);
      pack();
   }

   public float getConnectorX() {
      return getX() + getWidth();
   }

   public float getConnectorY() {
      return getY() + getHeight() / 2.0f;
   }
}