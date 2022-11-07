class com.openfeint.api.resource.Achievement$2 extends com.openfeint.internal.request.BitmapRequest {
	 /* .source "Achievement.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Achievement;->downloadIcon(Lcom/openfeint/api/resource/Achievement$DownloadIconCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Achievement this$0; //synthetic
final com.openfeint.api.resource.Achievement$DownloadIconCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Achievement$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 162 */
this.this$0 = p1;
this.val$cb = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BitmapRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 163 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 175 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 176 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Achievement$DownloadIconCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Achievement$DownloadIconCB;->onFailure(Ljava/lang/String;)V
	 /* .line 178 */
} // :cond_0
return;
} // .end method
public void onSuccess ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
/* .param p1, "responseBody" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 169 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 170 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Achievement$DownloadIconCB ) v0 ).onSuccess ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Achievement$DownloadIconCB;->onSuccess(Landroid/graphics/Bitmap;)V
	 /* .line 172 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 166 */
final String v0 = ""; // const-string v0, ""
} // .end method
public java.lang.String url ( ) {
/* .locals 1 */
/* .prologue */
/* .line 165 */
v0 = this.this$0;
v0 = this.iconUrl;
} // .end method
