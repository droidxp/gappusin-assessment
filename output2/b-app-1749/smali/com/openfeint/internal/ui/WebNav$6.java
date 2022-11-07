class com.openfeint.internal.ui.WebNav$6 implements com.openfeint.internal.OpenFeintInternal$IUploadDelegate {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->onActivityResult(IILandroid/content/Intent;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 965 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void fileUploadedTo ( java.lang.String p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "success" # Z */
/* .prologue */
/* .line 967 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 970 */
	 v0 = this.this$0;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "try { OF.page.onProfilePictureChanged(\'"; // const-string v2, "try { OF.page.onProfilePictureChanged(\'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'); } catch (e) {}"; // const-string v2, "\'); } catch (e) {}"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( com.openfeint.internal.ui.WebNav ) v0 ).executeJavascript ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
	 /* .line 972 */
} // :cond_0
return;
} // .end method
