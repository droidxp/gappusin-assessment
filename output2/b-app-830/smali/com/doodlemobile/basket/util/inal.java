public class inal {
	 /* # static fields */
	 private static java.lang.String a;
	 private static Boolean b;
	 private static Boolean c;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v0 = "Basket"; // const-string v0, "Basket"
		 com.doodlemobile.basket.util.b.b = (v1!= 0);
		 com.doodlemobile.basket.util.b.c = (v1!= 0);
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lcom/doodlemobile/basket/util/b;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 android.util.Log .d ( p0,p1 );
		 } // :cond_0
		 return;
	 } // .end method
	 public static void b ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lcom/doodlemobile/basket/util/b;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* sget-boolean v0, Lcom/doodlemobile/basket/util/b;->c:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 android.util.Log .d ( p0,p1 );
			 } // :cond_0
			 return;
		 } // .end method
		 public static void c ( java.lang.String p0, java.lang.String p1 ) {
			 /* .locals 1 */
			 /* sget-boolean v0, Lcom/doodlemobile/basket/util/b;->b:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 android.util.Log .w ( p0,p1 );
			 } // :cond_0
			 return;
		 } // .end method
