import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

final class Class_ax implements CommandListener {
   // $FF: synthetic field
   private TextBox a;
   // $FF: synthetic field
   private static final int[] b;
   // $FF: synthetic field
   private Class_at c;

   private static void a() {
      b = new int[1];
      b[0] = " ".length();
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (a(var1.getLabel().equals(Class_cv.rk))) {
         this.c.a(this.a.getString());
         Class_dl.a().b();
      }

      Display.getDisplay(Class_at.c).setCurrent(Class_at.e);
      Class_at.e.setFullScreenMode((boolean)b[0]);
   }

   Class_ax(Class_at var1, TextBox var2) {
      this.c = var1;
      this.a = var2;
   }

   private static boolean a(int var0) {
      return var0 != 0;
   }

   static {
      a();
   }
}
