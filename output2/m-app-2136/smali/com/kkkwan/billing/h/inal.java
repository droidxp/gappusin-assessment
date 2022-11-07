public class inal {
	 /* # static fields */
	 private static Boolean a;
	 private static Integer b;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.kkkwan.billing.h.f.a = (v0!= 0);
		 int v0 = 2; // const/4 v0, 0x2
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-lt v0, v1, :cond_0 */
		 final String v0 = "logUtil"; // const-string v0, "logUtil"
		 com.kkkwan.billing.h.f .a ( v0,p0 );
	 } // :cond_0
	 return;
} // .end method
public static void a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* sget-boolean v0, Lcom/kkkwan/billing/h/f;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-lt v0, v1, :cond_0 */
		 android.util.Log .i ( p0,p1 );
	 } // :cond_0
	 return;
} // .end method
public static void a ( Boolean p0 ) {
	 /* .locals 0 */
	 com.kkkwan.billing.h.f.a = (p0!= 0);
	 return;
} // .end method
