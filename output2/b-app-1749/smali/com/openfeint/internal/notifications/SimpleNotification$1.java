class com.openfeint.internal.notifications.SimpleNotification$1 extends com.openfeint.internal.request.BitmapRequest {
	 /* .source "SimpleNotification.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/notifications/SimpleNotification;->createView()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.notifications.SimpleNotification this$0; //synthetic
final android.widget.ImageView val$icon; //synthetic
/* # direct methods */
 com.openfeint.internal.notifications.SimpleNotification$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 40 */
this.this$0 = p1;
this.val$icon = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BitmapRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 50 */
final String v0 = "NotificationImage"; // const-string v0, "NotificationImage"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to load image "; // const-string v2, "Failed to load image "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.this$0;
v2 = this.imageName;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ":"; // const-string v2, ":"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 51 */
v0 = this.val$icon;
int v1 = 4; // const/4 v1, 0x4
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 52 */
v0 = this.this$0;
(( com.openfeint.internal.notifications.SimpleNotification ) v0 ).showToast ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/SimpleNotification;->showToast()V
/* .line 53 */
return;
} // .end method
public void onSuccess ( android.graphics.Bitmap p0 ) {
/* .locals 2 */
/* .param p1, "responseBody" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 45 */
v0 = this.val$icon;
/* new-instance v1, Landroid/graphics/drawable/BitmapDrawable; */
/* invoke-direct {v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 46 */
v0 = this.this$0;
(( com.openfeint.internal.notifications.SimpleNotification ) v0 ).showToast ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/SimpleNotification;->showToast()V
/* .line 47 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.this$0;
v0 = this.imageName;
} // .end method
