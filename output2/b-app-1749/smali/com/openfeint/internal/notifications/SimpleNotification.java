public class com.openfeint.internal.notifications.SimpleNotification extends com.openfeint.internal.notifications.NotificationBase {
	 /* .source "SimpleNotification.java" */
	 /* # direct methods */
	 protected com.openfeint.internal.notifications.SimpleNotification ( ) {
		 /* .locals 0 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .param p2, "imageName" # Ljava/lang/String; */
		 /* .param p3, "cat" # Lcom/openfeint/api/Notification$Category; */
		 /* .param p4, "type" # Lcom/openfeint/api/Notification$Type; */
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
	 /* .line 23 */
	 /* .local p5, "userData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 /* invoke-direct/range {p0 ..p5}, Lcom/openfeint/internal/notifications/NotificationBase;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/api/Notification$Category;Lcom/openfeint/api/Notification$Type;Ljava/util/Map;)V */
	 /* .line 24 */
	 return;
} // .end method
public static void show ( java.lang.String p0, com.openfeint.api.Notification$Category p1, com.openfeint.api.Notification$Type p2 ) {
	 /* .locals 1 */
	 /* .param p0, "text" # Ljava/lang/String; */
	 /* .param p1, "c" # Lcom/openfeint/api/Notification$Category; */
	 /* .param p2, "t" # Lcom/openfeint/api/Notification$Type; */
	 /* .prologue */
	 /* .line 76 */
	 int v0 = 0; // const/4 v0, 0x0
	 com.openfeint.internal.notifications.SimpleNotification .show ( p0,v0,p1,p2 );
	 /* .line 77 */
	 return;
} // .end method
public static void show ( java.lang.String p0, java.lang.String p1, com.openfeint.api.Notification$Category p2, com.openfeint.api.Notification$Type p3 ) {
	 /* .locals 6 */
	 /* .param p0, "text" # Ljava/lang/String; */
	 /* .param p1, "imageName" # Ljava/lang/String; */
	 /* .param p2, "c" # Lcom/openfeint/api/Notification$Category; */
	 /* .param p3, "t" # Lcom/openfeint/api/Notification$Type; */
	 /* .prologue */
	 /* .line 80 */
	 /* new-instance v0, Lcom/openfeint/internal/notifications/SimpleNotification; */
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v1, p0 */
	 /* move-object v2, p1 */
	 /* move-object v3, p2 */
	 /* move-object v4, p3 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/notifications/SimpleNotification;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/api/Notification$Category;Lcom/openfeint/api/Notification$Type;Ljava/util/Map;)V */
	 /* .line 81 */
	 /* .local v0, "notification":Lcom/openfeint/internal/notifications/SimpleNotification; */
	 (( com.openfeint.internal.notifications.SimpleNotification ) v0 ).checkDelegateAndView ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/SimpleNotification;->checkDelegateAndView()V
	 /* .line 83 */
	 return;
} // .end method
/* # virtual methods */
protected Boolean createView ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 /* .line 29 */
	 com.openfeint.internal.OpenFeintInternal .getInstance ( );
	 (( com.openfeint.internal.OpenFeintInternal ) v4 ).getContext ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
	 final String v5 = "layout_inflater"; // const-string v5, "layout_inflater"
	 (( android.content.Context ) v4 ).getSystemService ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/LayoutInflater; */
	 /* .line 30 */
	 /* .local v2, "inflater":Landroid/view/LayoutInflater; */
	 int v5 = 0; // const/4 v5, 0x0
	 (( android.view.LayoutInflater ) v2 ).inflate ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 this.displayView = v4;
	 /* .line 32 */
	 v4 = this.displayView;
	 (( android.view.View ) v4 ).findViewById ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v4, Landroid/widget/TextView; */
	 (( com.openfeint.internal.notifications.SimpleNotification ) p0 ).getText ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/notifications/SimpleNotification;->getText()Ljava/lang/String;
	 (( android.widget.TextView ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 34 */
	 v4 = this.displayView;
	 (( android.view.View ) v4 ).findViewById ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/ImageView; */
	 /* .line 36 */
	 /* .local v0, "icon":Landroid/widget/ImageView; */
	 v4 = this.imageName;
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 37 */
		 v4 = this.imageName;
		 com.openfeint.internal.notifications.SimpleNotification .getResourceDrawable ( v4 );
		 /* .line 38 */
		 /* .local v1, "image":Landroid/graphics/drawable/Drawable; */
		 /* if-nez v1, :cond_0 */
		 /* .line 40 */
		 /* new-instance v3, Lcom/openfeint/internal/notifications/SimpleNotification$1; */
		 /* invoke-direct {v3, p0, v0}, Lcom/openfeint/internal/notifications/SimpleNotification$1;-><init>(Lcom/openfeint/internal/notifications/SimpleNotification;Landroid/widget/ImageView;)V */
		 /* .line 56 */
		 /* .local v3, "req":Lcom/openfeint/internal/request/BitmapRequest; */
		 (( com.openfeint.internal.request.BitmapRequest ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/request/BitmapRequest;->launch()V
		 /* .line 58 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 66 */
	 } // .end local v1 # "image":Landroid/graphics/drawable/Drawable;
} // .end local v3 # "req":Lcom/openfeint/internal/request/BitmapRequest;
} // :goto_0
/* .line 60 */
/* .restart local v1 # "image":Landroid/graphics/drawable/Drawable; */
} // :cond_0
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 66 */
} // .end local v1 # "image":Landroid/graphics/drawable/Drawable;
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
/* .line 63 */
} // :cond_1
int v4 = 4; // const/4 v4, 0x4
(( android.widget.ImageView ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V
} // .end method
protected void drawView ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 72 */
v0 = this.displayView;
(( android.view.View ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
/* .line 73 */
return;
} // .end method
