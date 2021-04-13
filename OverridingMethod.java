/**
 * OverridingMethod
 */
public class OverridingMethod {

    class MethodA{
        public void start(){}
    }
    class MethodB extends MethodA{
        @Override
        public void start(){}
    }
}