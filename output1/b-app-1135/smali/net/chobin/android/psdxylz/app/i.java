public class net.chobin.android.psdxylz.app.i implements net.chobin.android.a.o {
	 /* # interfaces */
	 /* # static fields */
	 public static Integer a;
	 public static net.chobin.android.psdxylz.app.a a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.i ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 final String v0 = "chobin"; // const-string v0, "chobin"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "LVL allow :"; // const-string v2, "LVL allow :"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public void b ( Integer p0 ) {
	 /* .locals 3 */
	 int v0 = -1; // const/4 v0, -0x1
	 final String v0 = "chobin"; // const-string v0, "chobin"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "LVL don\'t allow :"; // const-string v2, "LVL don\'t allow :"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 return;
} // .end method
public Boolean b ( ) {
	 /* .locals 2 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne v1, v0, :cond_0 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void c ( Integer p0 ) {
/* .locals 3 */
int v0 = -1; // const/4 v0, -0x1
final String v0 = "chobin"; // const-string v0, "chobin"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "LVL error:"; // const-string v2, "LVL error:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
return;
} // .end method
