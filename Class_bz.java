import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public class Class_bz implements CommandListener {
   // $FF: synthetic field
   public static int a;
   // $FF: synthetic field
   private ChoiceGroup c;
   // $FF: synthetic field
   private Command d;
   // $FF: synthetic field
   private static Class_bz e;
   // $FF: synthetic field
   private static final int[] f;
   // $FF: synthetic field
   public static boolean b;
   // $FF: synthetic field
   private Form g;
   // $FF: synthetic field
   private Command h;
   // $FF: synthetic field
   private TextField i;

   private static void c() {
      f = new int[6];
      f[0] = -(-21538 & 23593) & -9 & 32063;
      f[1] = (43 ^ 57) & ~(188 ^ 174);
      f[2] = 162 ^ 168;
      f[3] = "  ".length();
      f[4] = " ".length();
      f[5] = 121 ^ 85 ^ 137 ^ 161;
   }

   public static Class_bz a() {
      if (a(e)) {
         e = new Class_bz();
      }

      return e;
   }

   private static void d() {
      try {
         ByteArrayOutputStream var0 = new ByteArrayOutputStream();
         DataOutputStream var1 = new DataOutputStream(var0);
         var1.writeInt(a);
         var1.writeBoolean(b);
         Class_eb.b("MenuJump", var0.toByteArray());
         var0.close();
         var1.close();
      } catch (Exception var2) {
         var2.printStackTrace();
         return;
      }

      "".length();
      if ("   ".length() == "   ".length()) {
         ;
      }
   }

   private static boolean a(int var0) {
      return var0 != 0;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (a(var1, this.d)) {
         try {
            a = Integer.parseInt(this.i.getString());
            b = this.c.isSelected(f[1]);
            d();
         } catch (Exception var4) {
            var4.printStackTrace();
            return;
         }

         "".length();
         if ("   ".length() >= (172 ^ 168)) {
            return;
         }
      }

      Display.getDisplay(Class_cr.e).setCurrent(Class_el.a);
   }

   public void b() {
      this.g = new Form("Cài đặt auto nhảy tránh né quái");
      this.i = new TextField("Thời gian nhảy", String.valueOf(a), f[2], f[3]);
      int var10004 = f[4];
      String[] var10005 = new String[f[3]];
      var10005[f[1]] = "Bật";
      var10005[f[4]] = "Tắt";
      this.c = new ChoiceGroup("Bật / Tắt auto nhảy", var10004, var10005, (Image[])null);
      this.d = new Command("Lưu", f[5], f[1]);
      this.h = new Command("Huỷ", f[5], f[4]);
      this.g.append(this.i);
      "".length();
      this.g.append(this.c);
      "".length();
      this.g.addCommand(this.d);
      this.g.addCommand(this.h);
      ChoiceGroup var10000 = this.c;
      int var10001;
      if (a(b)) {
         var10001 = f[1];
         "".length();
         if ((41 + 132 - 120 + 119 ^ 9 + 6 - -120 + 33) <= "  ".length()) {
            return;
         }
      } else {
         var10001 = f[4];
      }

      var10000.setSelectedIndex(var10001, (boolean)f[4]);
      this.g.setCommandListener(this);
      Display.getDisplay(Class_cr.e).setCurrent(this.g);
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void e() {
      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(Class_eb.c("MenuJump"));
         DataInputStream var1 = new DataInputStream(var0);
         a = var1.readInt();
         b = var1.readBoolean();
         var0.close();
         var1.close();
      } catch (Exception var2) {
         var2.printStackTrace();
         return;
      }

      "".length();
      if ((131 + 12 - 119 + 152 ^ 22 + 100 - 99 + 157) == (88 + 143 - 169 + 113 ^ 67 + 133 - 41 + 12)) {
         ;
      }
   }

   static {
      c();
      a = f[0];
      b = (boolean)f[1];
      e();
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }
}
