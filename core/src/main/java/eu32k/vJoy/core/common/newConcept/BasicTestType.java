package eu32k.vJoy.core.common.newConcept;

public class BasicTestType extends BasicType {

   public BasicTestType() {
      super("Number Mod", Type.NUMBER);
      getPorts().add(new Port("Number In", Type.NUMBER));
   }
}
