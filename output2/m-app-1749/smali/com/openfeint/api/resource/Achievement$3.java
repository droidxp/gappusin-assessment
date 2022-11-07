class com.openfeint.api.resource.Achievement$3 extends com.openfeint.api.resource.Achievement$UpdateProgressionCB {
	 /* .source "Achievement.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Achievement;->unlock(Lcom/openfeint/api/resource/Achievement$UnlockCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Achievement this$0; //synthetic
final com.openfeint.api.resource.Achievement$UnlockCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Achievement$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 203 */
this.this$0 = p1;
this.val$cb = p2;
/* invoke-direct {p0}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 208 */
v0 = this.val$cb;
(( com.openfeint.api.resource.Achievement$UnlockCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Achievement$UnlockCB;->onFailure(Ljava/lang/String;)V
/* .line 209 */
return;
} // .end method
public void onSuccess ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "complete" # Z */
/* .prologue */
/* .line 205 */
v0 = this.val$cb;
(( com.openfeint.api.resource.Achievement$UnlockCB ) v0 ).onSuccess ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Achievement$UnlockCB;->onSuccess(Z)V
/* .line 206 */
return;
} // .end method
