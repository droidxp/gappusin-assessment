public class com.openfeint.internal.notifications.AchievementNotification extends com.openfeint.internal.notifications.NotificationBase {
	 /* .source "AchievementNotification.java" */
	 /* # direct methods */
	 protected com.openfeint.internal.notifications.AchievementNotification ( ) {
		 /* .locals 6 */
		 /* .param p1, "achievement" # Lcom/openfeint/api/resource/Achievement; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/openfeint/api/resource/Achievement;", */
		 /* "Ljava/util/Map", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Object;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 26 */
	 /* .local p2, "userData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 com.openfeint.internal.OpenFeintInternal .getRString ( v0 );
	 int v2 = 0; // const/4 v2, 0x0
	 v3 = com.openfeint.api.Notification$Category.Achievement;
	 v4 = com.openfeint.api.Notification$Type.Success;
	 /* move-object v0, p0 */
	 /* move-object v5, p2 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/notifications/NotificationBase;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/api/Notification$Category;Lcom/openfeint/api/Notification$Type;Ljava/util/Map;)V */
	 /* .line 27 */
	 return;
} // .end method
public static void showStatus ( com.openfeint.api.resource.Achievement p0 ) {
	 /* .locals 3 */
	 /* .param p0, "achievement" # Lcom/openfeint/api/resource/Achievement; */
	 /* .prologue */
	 /* .line 92 */
	 /* new-instance v1, Ljava/util/HashMap; */
	 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
	 /* .line 93 */
	 /* .local v1, "userData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 final String v2 = "achievement"; // const-string v2, "achievement"
	 /* .line 94 */
	 /* new-instance v0, Lcom/openfeint/internal/notifications/AchievementNotification; */
	 /* invoke-direct {v0, p0, v1}, Lcom/openfeint/internal/notifications/AchievementNotification;-><init>(Lcom/openfeint/api/resource/Achievement;Ljava/util/Map;)V */
	 /* .line 95 */
	 /* .local v0, "notification":Lcom/openfeint/internal/notifications/AchievementNotification; */
	 (( com.openfeint.internal.notifications.AchievementNotification ) v0 ).checkDelegateAndView ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/notifications/AchievementNotification;->checkDelegateAndView()V
	 /* .line 96 */
	 return;
} // .end method
/* # virtual methods */
protected Boolean createView ( ) {
	 /* .locals 10 */
	 /* .prologue */
	 int v8 = 1; // const/4 v8, 0x1
	 int v7 = 0; // const/4 v7, 0x0
	 int v9 = 4; // const/4 v9, 0x4
	 /* .line 35 */
	 (( com.openfeint.internal.notifications.AchievementNotification ) p0 ).getUserData ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/notifications/AchievementNotification;->getUserData()Ljava/util/Map;
	 final String v6 = "achievement"; // const-string v6, "achievement"
	 /* check-cast v0, Lcom/openfeint/api/resource/Achievement; */
	 /* .line 37 */
	 /* .local v0, "achievement":Lcom/openfeint/api/resource/Achievement; */
	 com.openfeint.internal.OpenFeintInternal .getInstance ( );
	 (( com.openfeint.internal.OpenFeintInternal ) v5 ).getContext ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
	 final String v6 = "layout_inflater"; // const-string v6, "layout_inflater"
	 (( android.content.Context ) v5 ).getSystemService ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/LayoutInflater; */
	 /* .line 38 */
	 /* .local v2, "inflater":Landroid/view/LayoutInflater; */
	 int v6 = 0; // const/4 v6, 0x0
	 (( android.view.LayoutInflater ) v2 ).inflate ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 this.displayView = v5;
	 /* .line 39 */
	 /* iget-boolean v5, v0, Lcom/openfeint/api/resource/Achievement;->isUnlocked:Z */
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* .line 40 */
		 v5 = this.displayView;
		 (( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 (( android.view.View ) v5 ).setVisibility ( v9 ); // invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V
		 /* .line 42 */
		 /* iget v5, v0, Lcom/openfeint/api/resource/Achievement;->gamerscore:I */
		 /* if-nez v5, :cond_0 */
		 /* .line 43 */
		 v5 = this.displayView;
		 (( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 (( android.view.View ) v5 ).setVisibility ( v9 ); // invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V
		 /* .line 44 */
		 v5 = this.displayView;
		 (( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 (( android.view.View ) v5 ).setVisibility ( v9 ); // invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V
		 /* .line 50 */
	 } // :cond_0
} // :goto_0
v5 = this.displayView;
(( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/TextView; */
v6 = this.title;
if ( v6 != null) { // if-eqz v6, :cond_2
	 v6 = this.title;
	 v6 = 	 (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
	 /* if-lez v6, :cond_2 */
	 v6 = this.title;
} // :goto_1
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 55 */
/* iget-boolean v5, v0, Lcom/openfeint/api/resource/Achievement;->isUnlocked:Z */
if ( v5 != null) { // if-eqz v5, :cond_3
	 /* iget v5, v0, Lcom/openfeint/api/resource/Achievement;->gamerscore:I */
	 java.lang.Integer .toString ( v5 );
	 /* .line 56 */
	 /* .local v4, "scoreText":Ljava/lang/String; */
} // :goto_2
v5 = this.displayView;
(( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/TextView; */
(( android.widget.TextView ) v5 ).setText ( v4 ); // invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 58 */
v5 = this.iconUrl;
if ( v5 != null) { // if-eqz v5, :cond_5
	 /* .line 59 */
	 v5 = this.iconUrl;
	 com.openfeint.internal.notifications.AchievementNotification .getResourceDrawable ( v5 );
	 /* .line 60 */
	 /* .local v1, "iconImage":Landroid/graphics/drawable/Drawable; */
	 /* if-nez v1, :cond_4 */
	 /* .line 62 */
	 /* new-instance v3, Lcom/openfeint/internal/notifications/AchievementNotification$1; */
	 v5 = this.iconUrl;
	 /* invoke-direct {v3, p0, v5, v0}, Lcom/openfeint/internal/notifications/AchievementNotification$1;-><init>(Lcom/openfeint/internal/notifications/AchievementNotification;Ljava/lang/String;Lcom/openfeint/api/resource/Achievement;)V */
	 /* .line 75 */
	 /* .local v3, "req":Lcom/openfeint/internal/request/BitmapRequest; */
	 (( com.openfeint.internal.request.BitmapRequest ) v3 ).launch ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/request/BitmapRequest;->launch()V
	 /* move v5, v7 */
	 /* .line 83 */
} // .end local v1 # "iconImage":Landroid/graphics/drawable/Drawable;
} // .end local v3 # "req":Lcom/openfeint/internal/request/BitmapRequest;
} // :goto_3
/* .line 47 */
} // .end local v4 # "scoreText":Ljava/lang/String;
} // :cond_1
v5 = this.displayView;
(( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
(( android.view.View ) v5 ).setVisibility ( v9 ); // invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V
/* .line 50 */
} // :cond_2
com.openfeint.internal.OpenFeintInternal .getRString ( v6 );
/* .line 55 */
} // :cond_3
final String v5 = "%d%%"; // const-string v5, "%d%%"
/* new-array v6, v8, [Ljava/lang/Object; */
/* iget v9, v0, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* float-to-int v9, v9 */
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v6, v7 */
java.lang.String .format ( v5,v6 );
/* .line 80 */
/* .restart local v1 # "iconImage":Landroid/graphics/drawable/Drawable; */
/* .restart local v4 # "scoreText":Ljava/lang/String; */
} // :cond_4
v5 = this.displayView;
(( android.view.View ) v5 ).findViewById ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v5 ).setImageDrawable ( v1 ); // invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // .end local v1 # "iconImage":Landroid/graphics/drawable/Drawable;
} // :cond_5
/* move v5, v8 */
/* .line 83 */
} // .end method
protected void drawView ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 88 */
v0 = this.displayView;
(( android.view.View ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
/* .line 89 */
return;
} // .end method
public void loadedImage ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
/* .param p1, "map" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 31 */
v0 = this.displayView;
(( android.view.View ) v0 ).invalidate ( ); // invoke-virtual {v0}, Landroid/view/View;->invalidate()V
/* .line 32 */
return;
} // .end method
