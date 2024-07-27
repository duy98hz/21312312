public class Class_cb extends Class_cs {
   // $FF: synthetic field
   private String a;
   // $FF: synthetic field
   private long o;

   public String a() {
      return "Auto chat";
   }

   public Class_cb(String var1) {
      this.a = var1;
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean e(int var0) {
      return var0 < 0;
   }

   public void b() {
      if (!e(a(Class_bm.b() - this.o, 10000L))) {
         this.o = Class_bm.b();
         Class_ao.a().a(this.a);
      }
   }
}
