package eu32k.vJoy.core.common.workset.atomic;

import eu32k.vJoy.core.common.workset.Instance;

public abstract class BooleanInstance extends Instance {

   public BooleanInstance(BooleanType type, float x, float y) {
      super(type, x, y);
   }

   public abstract boolean getValue();
}
