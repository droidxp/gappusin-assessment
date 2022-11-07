class com.openfeint.api.resource.User$5 extends com.openfeint.internal.request.BitmapRequest {
	 /* .source "User.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/User;->downloadProfilePicture(Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.User this$0; //synthetic
final com.openfeint.api.resource.User$DownloadProfilePictureCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.User$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 257 */
this.this$0 = p1;
this.val$cb = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BitmapRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 269 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 270 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.User$DownloadProfilePictureCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;->onFailure(Ljava/lang/String;)V
	 /* .line 272 */
} // :cond_0
return;
} // .end method
public void onSuccess ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
/* .param p1, "responseBody" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 263 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 264 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.User$DownloadProfilePictureCB ) v0 ).onSuccess ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;->onSuccess(Landroid/graphics/Bitmap;)V
	 /* .line 266 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 260 */
final String v0 = ""; // const-string v0, ""
} // .end method
public java.lang.String url ( ) {
/* .locals 1 */
/* .prologue */
/* .line 259 */
v0 = this.this$0;
v0 = this.profilePictureUrl;
} // .end method
