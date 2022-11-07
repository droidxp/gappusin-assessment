class com.ansca.corona.Controller$25$1 extends com.openfeint.api.resource.Achievement$UnlockCB {
	 /* .source "Controller.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller$25;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller$25 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$25$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1444 */
this.this$1 = p1;
/* invoke-direct {p0}, Lcom/openfeint/api/resource/Achievement$UnlockCB;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 1451 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "OpenFeint: Failed to unlock achievement.("; // const-string v2, "OpenFeint: Failed to unlock achievement.("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1452 */
return;
} // .end method
public void onSuccess ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "newUnlock" # Z */
/* .prologue */
/* .line 1448 */
return;
} // .end method
