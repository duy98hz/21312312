import java.util.Hashtable;

public final class Class_cc extends Hashtable {
   public final synchronized Object a(String var1) {
      return super.get(var1);
   }

   public final synchronized Object remove(Object var1) {
      return super.remove(var1);
   }

   public final synchronized Object a(String var1, Object var2) {
      return super.put(var1, var2);
   }

   public final synchronized void clear() {
      super.clear();
   }
}
