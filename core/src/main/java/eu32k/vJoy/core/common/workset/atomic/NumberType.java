package eu32k.vJoy.core.common.workset.atomic;

import eu32k.vJoy.core.common.workset.DataType;
import eu32k.vJoy.core.common.workset.Type;

public abstract class NumberType extends Type {

   public NumberType(String name) {
      super(name, DataType.NUMBER);
   }

   @Override
   public abstract NumberInstance instanciate(float x, float y);
}
