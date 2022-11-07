class com.naef.jnlua.NativeSupport$DefaultLoader implements com.naef.jnlua.NativeSupport$Loader {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/NativeSupport; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "DefaultLoader" */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.NativeSupport this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.NativeSupport$DefaultLoader ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.naef.jnlua.NativeSupport$DefaultLoader ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/NativeSupport$DefaultLoader;-><init>(Lcom/naef/jnlua/NativeSupport;)V */
return;
} // .end method
/* # virtual methods */
public void load ( ) {
/* .locals 1 */
final String v0 = "jnlua5.1"; // const-string v0, "jnlua5.1"
java.lang.System .loadLibrary ( v0 );
return;
} // .end method
