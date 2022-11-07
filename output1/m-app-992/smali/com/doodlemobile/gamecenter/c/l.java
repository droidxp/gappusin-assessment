public abstract class com.doodlemobile.gamecenter.c.l {
	 /* # static fields */
	 private static java.lang.String a;
	 /* # instance fields */
	 protected Integer b;
	 public java.lang.String c;
	 protected org.apache.http.client.methods.HttpPost d;
	 private java.lang.String e;
	 private java.lang.Boolean f;
	 /* # direct methods */
	 static com.doodlemobile.gamecenter.c.l ( ) {
		 /* .locals 1 */
		 final String v0 = "http://m.doodlemobile.com:8080/"; // const-string v0, "http://m.doodlemobile.com:8080/"
		 return;
	 } // .end method
	 public com.doodlemobile.gamecenter.c.l ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.e = v0;
		 this.d = v0;
		 this.f = v0;
		 /* new-instance v0, Lorg/apache/http/client/methods/HttpPost; */
		 (( com.doodlemobile.gamecenter.c.l ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/c/l;->d()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
		 this.d = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract org.apache.http.client.methods.HttpPost a ( ) {
	 } // .end method
	 protected final void a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 this.e = p1;
		 return;
	 } // .end method
	 public abstract Boolean a ( Object p0 ) {
	 } // .end method
	 public Integer b ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x4e20 */
	 } // .end method
	 public Integer c ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x4e20 */
	 } // .end method
	 public java.lang.String d ( ) {
		 /* .locals 2 */
		 v0 = this.f;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/Boolean; */
		 v1 = 		 com.doodlemobile.gamecenter.cm .a ( );
		 /* invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V */
		 this.f = v0;
	 } // :cond_0
	 v0 = this.f;
	 v0 = 	 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 final String v0 = "http://m.doodlemobile.com:8080/dm/DoodleMobileServlert2"; // const-string v0, "http://m.doodlemobile.com:8080/dm/DoodleMobileServlert2"
	 } // :goto_0
} // :cond_1
final String v0 = "http://m.doodlemobile.com:8080/dm_v3/DoodleMobileServlert3"; // const-string v0, "http://m.doodlemobile.com:8080/dm_v3/DoodleMobileServlert3"
} // .end method
public final java.lang.String e ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
