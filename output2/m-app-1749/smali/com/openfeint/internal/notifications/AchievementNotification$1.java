class com.openfeint.internal.notifications.AchievementNotification$1 extends com.openfeint.internal.request.ExternalBitmapRequest {
	 /* .source "AchievementNotification.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/notifications/AchievementNotification;->createView()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.notifications.AchievementNotification this$0; //synthetic
final com.openfeint.api.resource.Achievement val$achievement; //synthetic
/* # direct methods */
 com.openfeint.internal.notifications.AchievementNotification$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Ljava/lang/String; */
/* .prologue */
/* .line 62 */
this.this$0 = p1;
this.val$achievement = p3;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/ExternalBitmapRequest;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 70 */
final String v0 = "NotificationImage"; // const-string v0, "NotificationImage"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to load image "; // const-string v2, "Failed to load image "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.val$achievement;
v2 = this.iconUrl;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ":"; // const-string v2, ":"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 71 */
v0 = this.this$0;
(( com.openfeint.internal.notifications.AchievementNotification ) v0 ).showToast ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/AchievementNotification;->showToast()V
/* .line 72 */
return;
} // .end method
public void onSuccess ( android.graphics.Bitmap p0 ) {
/* .locals 2 */
/* .param p1, "responseBody" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 65 */
v0 = this.this$0;
v0 = this.displayView;
(( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
/* new-instance v1, Landroid/graphics/drawable/BitmapDrawable; */
/* invoke-direct {v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 66 */
v0 = this.this$0;
(( com.openfeint.internal.notifications.AchievementNotification ) v0 ).showToast ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/AchievementNotification;->showToast()V
/* .line 67 */
return;
} // .end method
