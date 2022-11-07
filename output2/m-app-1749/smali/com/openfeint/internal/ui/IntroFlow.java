public class com.openfeint.internal.ui.IntroFlow extends com.openfeint.internal.ui.WebNav {
	 /* .source "IntroFlow.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
android.graphics.Bitmap cachedImage;
/* # direct methods */
public com.openfeint.internal.ui.IntroFlow ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 15 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
protected com.openfeint.internal.ui.WebNav$ActionHandler createActionHandler ( com.openfeint.internal.ui.WebNav p0 ) {
	 /* .locals 1 */
	 /* .param p1, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
	 /* .prologue */
	 /* .line 38 */
	 /* new-instance v0, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler; */
	 /* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler;-><init>(Lcom/openfeint/internal/ui/IntroFlow;Lcom/openfeint/internal/ui/WebNav;)V */
} // .end method
protected java.lang.String initialContentPath ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 20 */
	 (( com.openfeint.internal.ui.IntroFlow ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/IntroFlow;->getIntent()Landroid/content/Intent;
	 final String v2 = "content_name"; // const-string v2, "content_name"
	 (( android.content.Intent ) v1 ).getStringExtra ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 21 */
	 /* .local v0, "contentName":Ljava/lang/String; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 22 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "intro/"; // const-string v2, "intro/"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 24 */
	 } // :goto_0
} // :cond_0
final String v1 = "intro/index"; // const-string v1, "intro/index"
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "returnedIntent" # Landroid/content/Intent; */
/* .prologue */
/* .line 30 */
v0 = com.openfeint.internal.ImagePicker .isImagePickerActivityResult ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 31 */
	 /* const/16 v0, 0x98 */
	 com.openfeint.internal.ImagePicker .onImagePickerActivityResult ( p0,p2,v0,p3 );
	 this.cachedImage = v0;
	 /* .line 33 */
} // :cond_0
return;
} // .end method
