public abstract class com.openfeint.internal.notifications.NotificationBase extends com.openfeint.api.Notification {
	 /* .source "NotificationBase.java" */
	 /* # static fields */
	 static java.util.Map drawableCache;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private com.openfeint.api.Notification$Category category;
android.view.View displayView;
protected java.lang.String imageName;
private java.lang.String text;
android.widget.Toast toast;
private com.openfeint.api.Notification$Type type;
private java.util.Map userData;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.openfeint.internal.notifications.NotificationBase ( ) {
/* .locals 1 */
/* .prologue */
/* .line 72 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
protected com.openfeint.internal.notifications.NotificationBase ( ) {
/* .locals 0 */
/* .param p1, "_text" # Ljava/lang/String; */
/* .param p2, "_imageName" # Ljava/lang/String; */
/* .param p3, "_cat" # Lcom/openfeint/api/Notification$Category; */
/* .param p4, "_type" # Lcom/openfeint/api/Notification$Type; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Lcom/openfeint/api/Notification$Category;", */
/* "Lcom/openfeint/api/Notification$Type;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 35 */
/* .local p5, "_userData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* invoke-direct {p0}, Lcom/openfeint/api/Notification;-><init>()V */
/* .line 36 */
this.text = p1;
/* .line 37 */
this.imageName = p2;
/* .line 38 */
this.category = p3;
/* .line 39 */
this.type = p4;
/* .line 40 */
this.userData = p5;
/* .line 41 */
return;
} // .end method
static android.graphics.drawable.Drawable getResourceDrawable ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 74 */
v3 = v3 = com.openfeint.internal.notifications.NotificationBase.drawableCache;
/* if-nez v3, :cond_0 */
/* .line 75 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 76 */
/* .local v1, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
v0 = (( com.openfeint.internal.OpenFeintInternal ) v1 ).getResource ( p0 ); // invoke-virtual {v1, p0}, Lcom/openfeint/internal/OpenFeintInternal;->getResource(Ljava/lang/String;)I
/* .line 77 */
/* .local v0, "bitmapHandle":I */
/* if-nez v0, :cond_1 */
/* .line 78 */
v3 = com.openfeint.internal.notifications.NotificationBase.drawableCache;
int v4 = 0; // const/4 v4, 0x0
/* .line 85 */
} // .end local v0 # "bitmapHandle":I
} // .end local v1 # "ofi":Lcom/openfeint/internal/OpenFeintInternal;
} // :cond_0
} // :goto_0
v3 = com.openfeint.internal.notifications.NotificationBase.drawableCache;
/* check-cast v3, Landroid/graphics/drawable/Drawable; */
/* .line 81 */
/* .restart local v0 # "bitmapHandle":I */
/* .restart local v1 # "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
} // :cond_1
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 82 */
/* .local v2, "r":Landroid/content/res/Resources; */
v3 = com.openfeint.internal.notifications.NotificationBase.drawableCache;
(( android.content.res.Resources ) v2 ).getDrawable ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
} // .end method
/* # virtual methods */
protected void checkDelegateAndView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 89 */
com.openfeint.internal.notifications.NotificationBase .getDelegate ( );
v0 = (( com.openfeint.api.Notification$Delegate ) v0 ).canShowNotification ( p0 ); // invoke-virtual {v0, p0}, Lcom/openfeint/api/Notification$Delegate;->canShowNotification(Lcom/openfeint/api/Notification;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 90 */
com.openfeint.internal.notifications.NotificationBase .getDelegate ( );
(( com.openfeint.api.Notification$Delegate ) v0 ).notificationWillShow ( p0 ); // invoke-virtual {v0, p0}, Lcom/openfeint/api/Notification$Delegate;->notificationWillShow(Lcom/openfeint/api/Notification;)V
/* .line 91 */
v0 = (( com.openfeint.internal.notifications.NotificationBase ) p0 ).createView ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/notifications/NotificationBase;->createView()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.openfeint.internal.notifications.NotificationBase ) p0 ).showToast ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/notifications/NotificationBase;->showToast()V
/* .line 97 */
} // :cond_0
} // :goto_0
return;
/* .line 95 */
} // :cond_1
com.openfeint.internal.notifications.NotificationBase .getDelegate ( );
(( com.openfeint.api.Notification$Delegate ) v0 ).displayNotification ( p0 ); // invoke-virtual {v0, p0}, Lcom/openfeint/api/Notification$Delegate;->displayNotification(Lcom/openfeint/api/Notification;)V
} // .end method
protected java.lang.String clippedText ( android.graphics.Paint p0, java.lang.String p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "paint" # Landroid/graphics/Paint; */
/* .param p2, "text" # Ljava/lang/String; */
/* .param p3, "length" # I */
/* .prologue */
/* .line 49 */
/* move-object v1, p2 */
/* .line 50 */
/* .local v1, "outText":Ljava/lang/String; */
int v2 = 1; // const/4 v2, 0x1
/* int-to-float v3, p3 */
int v4 = 0; // const/4 v4, 0x0
v0 = (( android.graphics.Paint ) p1 ).breakText ( p2, v2, v3, v4 ); // invoke-virtual {p1, p2, v2, v3, v4}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I
/* .line 51 */
/* .local v0, "endLength":I */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-ge v0, v2, :cond_0 */
/* .line 52 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
/* add-int/lit8 v4, v0, -0x1 */
(( java.lang.String ) v1 ).substring ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "..."; // const-string v3, "..."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 54 */
} // :cond_0
} // .end method
protected abstract Boolean createView ( ) {
} // .end method
protected abstract void drawView ( android.graphics.Canvas p0 ) {
} // .end method
public com.openfeint.api.Notification$Category getCategory ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = this.category;
} // .end method
public java.lang.String getText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 30 */
v0 = this.text;
} // .end method
public com.openfeint.api.Notification$Type getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
v0 = this.type;
} // .end method
public java.util.Map getUserData ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 33 */
v0 = this.userData;
} // .end method
protected void showToast ( ) {
/* .locals 2 */
/* .prologue */
/* .line 58 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* new-instance v1, Lcom/openfeint/internal/notifications/NotificationBase$1; */
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/notifications/NotificationBase$1;-><init>(Lcom/openfeint/internal/notifications/NotificationBase;)V */
(( com.openfeint.internal.OpenFeintInternal ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 68 */
return;
} // .end method
