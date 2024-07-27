import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Class_bg {
   // $FF: synthetic field
   private DataInputStream b = null;
   // $FF: synthetic field
   private DataOutputStream c = null;
   // $FF: synthetic field
   private ByteArrayOutputStream d = null;
   // $FF: synthetic field
   public byte a;
   // $FF: synthetic field
   private ByteArrayInputStream e = null;

   public final DataOutputStream a() {
      return this.c;
   }

   public final DataInputStream b() {
      return this.b;
   }

   public final byte[] c() {
      return this.d.toByteArray();
   }

   public Class_bg(byte var1, byte[] var2) {
      this.a = var1;
      this.e = new ByteArrayInputStream(var2);
      this.b = new DataInputStream(this.e);
   }

   public final void d() {
      try {
         if (a(this.b)) {
            this.b.close();
         }

         if (a(this.c)) {
            this.c.close();
            return;
         }
      } catch (IOException var2) {
      }

   }

   public Class_bg() {
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   public Class_bg(byte var1) {
      this.a = var1;
      this.d = new ByteArrayOutputStream();
      this.c = new DataOutputStream(this.d);
   }
}
