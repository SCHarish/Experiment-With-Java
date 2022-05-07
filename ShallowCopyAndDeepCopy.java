public class ShallowCopyAndDeepCopy {
    public static void main(String args[]){
        ShallowCopyAndDeepCopy obj = new ShallowCopyAndDeepCopy();

        SampleExample testObj = obj.new SampleExample(1, "sdf");
        testObj.clone();
    }

    class SampleExample implements Cloneable{
        int id;
        String name;

        SampleExample(int id, String name){
            this.id = id;
            this.name = name;
        }

        SampleExample(SampleExample originalObject){ //copy constructor
            this(originalObject.id, originalObject.name);
        }

        @Override
        public SampleExample clone(){
            try{
                return (SampleExample) super.clone();
            } catch(CloneNotSupportedException ex){

            }
            return null;
        }
    }
}
