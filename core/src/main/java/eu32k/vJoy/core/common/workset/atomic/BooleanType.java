package eu32k.vJoy.core.common.workset.atomic;

import eu32k.vJoy.core.common.workset.DataType;
import eu32k.vJoy.core.common.workset.Type;

public abstract class BooleanType extends Type {

   public BooleanType(String name) {
      super(name, DataType.BOOLEAN);
   }

   @Override
   public abstract BooleanInstance instanciate(float x, float y);
}
