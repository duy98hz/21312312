import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class Class_dw {
   private static final int[] a;

   private static void a() {
      a = new int[2];
      a[0] = 52 + 74 - 106 + 124 + 78 + 31 - 69 + 117 - (59 + 88 - 94 + 75) + (160 ^ 187);
      a[1] = -" ".length();
   }

   private static boolean a(int var0, int var1) {
      return var0 != var1;
   }

   public static String a(String var0) {
      String var1 = "";

      try {
         HttpConnection var2;
         if (a((var2 = (HttpConnection)Connector.open(var0)).getResponseCode(), a[0])) {
            throw new IOException(var2.getResponseMessage());
         }

         InputStream var3 = var2.openInputStream();
         new InputStreamReader(var3, "utf-8");
         "".length();

         int var4;
         while(a(var4 = var3.read(), a[1])) {
            var1 = String.valueOf((new StringBuilder()).append(String.valueOf(String.valueOf(var1))).append((char)var4));
            "".length();
            if ("   ".length() >= (86 ^ 82)) {
               return null;
            }
         }
      } catch (Exception var5) {
         var1 = null;
         return var1;
      }

      "".length();
      if (((126 ^ 63) & ~(99 ^ 34)) != ((141 ^ 179) & ~(22 ^ 40))) {
         return null;
      } else {
         return var1;
      }
   }

   static {
      a();
   }
}
