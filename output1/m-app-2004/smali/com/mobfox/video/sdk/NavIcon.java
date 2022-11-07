public class com.mobfox.video.sdk.NavIcon extends android.widget.LinearLayout implements android.view.View$OnClickListener {
	 /* .source "NavIcon.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.content.Context mContext;
	 private android.os.Handler mHandler;
	 private com.mobfox.video.sdk.NavIconData mIcon;
	 /* # direct methods */
	 public com.mobfox.video.sdk.NavIcon ( ) {
		 /* .locals 6 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "icon" # Lcom/mobfox/video/sdk/NavIconData; */
		 /* .prologue */
		 int v5 = 0; // const/4 v5, 0x0
		 int v4 = 1; // const/4 v4, 0x1
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 36 */
		 /* const/high16 v2, 0x40800000 # 4.0f */
		 (( com.mobfox.video.sdk.NavIcon ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/NavIcon;->getResources()Landroid/content/res/Resources;
		 /* .line 37 */
		 (( android.content.res.Resources ) v3 ).getDisplayMetrics ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 35 */
		 v2 = 		 android.util.TypedValue .applyDimension ( v4,v2,v3 );
		 /* float-to-int v1, v2 */
		 /* .line 44 */
		 /* .local v1, "padding":I */
		 this.mContext = p1;
		 /* .line 45 */
		 this.mIcon = p2;
		 /* .line 46 */
		 (( com.mobfox.video.sdk.NavIcon ) p0 ).setOrientation ( v4 ); // invoke-virtual {p0, v4}, Lcom/mobfox/video/sdk/NavIcon;->setOrientation(I)V
		 /* .line 47 */
		 (( com.mobfox.video.sdk.NavIcon ) p0 ).setPadding ( v1, v5, v1, v5 ); // invoke-virtual {p0, v1, v5, v1, v5}, Lcom/mobfox/video/sdk/NavIcon;->setPadding(IIII)V
		 /* .line 48 */
		 /* new-instance v2, Landroid/os/Handler; */
		 /* invoke-direct {v2}, Landroid/os/Handler;-><init>()V */
		 this.mHandler = v2;
		 /* .line 49 */
		 /* new-instance v0, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
		 v2 = this.mContext;
		 /* invoke-direct {v0, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
		 /* .line 50 */
		 /* .local v0, "iconImage":Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
		 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setAdjustViewBounds ( v4 ); // invoke-virtual {v0, v4}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setAdjustViewBounds(Z)V
		 /* .line 51 */
		 /* const/16 v2, 0x8 */
		 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
		 /* .line 52 */
		 v2 = this.iconUrl;
		 /* invoke-direct {p0, v0, v2}, Lcom/mobfox/video/sdk/NavIcon;->setImageDrawable(Landroid/widget/ImageView;Ljava/lang/String;)V */
		 /* .line 59 */
		 (( com.mobfox.video.sdk.NavIcon ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/NavIcon;->addView(Landroid/view/View;)V
		 /* .line 69 */
		 (( com.mobfox.video.sdk.NavIcon ) p0 ).setOnClickListener ( p0 ); // invoke-virtual {p0, p0}, Lcom/mobfox/video/sdk/NavIcon;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 70 */
		 return;
	 } // .end method
	 static android.graphics.drawable.Drawable access$0 ( com.mobfox.video.sdk.NavIcon p0, java.lang.String p1 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 94 */
		 /* invoke-direct {p0, p1}, Lcom/mobfox/video/sdk/NavIcon;->fetchImage(Ljava/lang/String;)Landroid/graphics/drawable/Drawable; */
	 } // .end method
	 static android.os.Handler access$1 ( com.mobfox.video.sdk.NavIcon p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 v0 = this.mHandler;
	 } // .end method
	 private android.graphics.drawable.Drawable fetchImage ( java.lang.String p0 ) {
		 /* .locals 15 */
		 /* .param p1, "urlString" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 95 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* .line 97 */
		 /* .local v7, "in":Ljava/io/InputStream; */
		 try { // :try_start_0
			 /* new-instance v10, Ljava/net/URL; */
			 /* move-object/from16 v0, p1 */
			 /* invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
			 /* .line 98 */
			 /* .local v10, "url":Ljava/net/URL; */
			 (( java.net.URL ) v10 ).getContent ( ); // invoke-virtual {v10}, Ljava/net/URL;->getContent()Ljava/lang/Object;
			 /* move-object v0, v12 */
			 /* check-cast v0, Ljava/io/InputStream; */
			 /* move-object v7, v0 */
			 /* .line 99 */
			 android.graphics.BitmapFactory .decodeStream ( v7 );
			 /* .line 100 */
			 /* .local v1, "b":Landroid/graphics/Bitmap; */
			 if ( v1 != null) { // if-eqz v1, :cond_6
				 /* .line 102 */
				 v12 = this.mContext;
				 (( android.content.Context ) v12 ).getResources ( ); // invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
				 (( android.content.res.Resources ) v12 ).getDisplayMetrics ( ); // invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
				 /* .line 103 */
				 /* .local v9, "m":Landroid/util/DisplayMetrics; */
				 v11 = 				 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
				 /* .line 104 */
				 /* .local v11, "w":I */
				 v4 = 				 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
				 /* .line 106 */
				 /* .local v4, "h":I */
				 int v12 = 1; // const/4 v12, 0x1
				 /* int-to-float v13, v11 */
				 /* .line 105 */
				 v12 = 				 android.util.TypedValue .applyDimension ( v12,v13,v9 );
				 /* float-to-int v6, v12 */
				 /* .line 108 */
				 /* .local v6, "imageWidth":I */
				 int v12 = 1; // const/4 v12, 0x1
				 /* int-to-float v13, v4 */
				 /* .line 107 */
				 v12 = 				 android.util.TypedValue .applyDimension ( v12,v13,v9 );
				 /* float-to-int v5, v12 */
				 /* .line 109 */
				 /* .local v5, "imageHeight":I */
				 /* if-ne v6, v11, :cond_0 */
				 /* if-eq v5, v4, :cond_1 */
				 /* .line 111 */
			 } // :cond_0
			 int v12 = 0; // const/4 v12, 0x0
			 /* .line 110 */
			 android.graphics.Bitmap .createScaledBitmap ( v1,v6,v5,v12 );
			 /* .line 113 */
		 } // :cond_1
		 /* new-instance v2, Landroid/graphics/drawable/BitmapDrawable; */
		 v12 = this.mContext;
		 (( android.content.Context ) v12 ).getResources ( ); // invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* invoke-direct {v2, v12, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 120 */
		 if ( v7 != null) { // if-eqz v7, :cond_2
			 /* .line 122 */
			 try { // :try_start_1
				 (( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
				 /* .line 123 */
				 int v7 = 0; // const/4 v7, 0x0
				 /* .line 136 */
			 } // .end local v1 # "b":Landroid/graphics/Bitmap;
		 } // .end local v4 # "h":I
	 } // .end local v5 # "imageHeight":I
} // .end local v6 # "imageWidth":I
} // .end local v9 # "m":Landroid/util/DisplayMetrics;
} // .end local v10 # "url":Ljava/net/URL;
} // .end local v11 # "w":I
} // :cond_2
} // :goto_0
/* .line 115 */
/* :catch_0 */
/* move-exception v3 */
/* .line 116 */
/* .local v3, "e":Ljava/lang/Exception; */
try { // :try_start_2
final String v12 = "MOBFOX"; // const-string v12, "MOBFOX"
int v13 = 3; // const/4 v13, 0x3
v12 = android.util.Log .isLoggable ( v12,v13 );
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 117 */
final String v12 = "MOBFOX"; // const-string v12, "MOBFOX"
/* new-instance v13, Ljava/lang/StringBuilder; */
final String v14 = "NavIcon cannot load resource "; // const-string v14, "NavIcon cannot load resource "
/* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v13 ).append ( v0 ); // invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v12,v13 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 120 */
} // :cond_3
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 122 */
try { // :try_start_3
(( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
/* .line 123 */
int v7 = 0; // const/4 v7, 0x0
/* .line 130 */
} // .end local v3 # "e":Ljava/lang/Exception;
} // :cond_4
} // :goto_1
try { // :try_start_4
/* new-instance v10, Ljava/net/URL; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 131 */
/* .restart local v10 # "url":Ljava/net/URL; */
(( java.net.URL ) v10 ).getContent ( ); // invoke-virtual {v10}, Ljava/net/URL;->getContent()Ljava/lang/Object;
/* check-cast v8, Ljava/io/InputStream; */
/* .line 132 */
/* .local v8, "is":Ljava/io/InputStream; */
final String v12 = "src"; // const-string v12, "src"
android.graphics.drawable.Drawable .createFromStream ( v8,v12 );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 133 */
/* .local v2, "d":Landroid/graphics/drawable/Drawable; */
/* .line 119 */
} // .end local v2 # "d":Landroid/graphics/drawable/Drawable;
} // .end local v8 # "is":Ljava/io/InputStream;
} // .end local v10 # "url":Ljava/net/URL;
/* :catchall_0 */
/* move-exception v12 */
/* .line 120 */
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 122 */
try { // :try_start_5
(( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_4 */
/* .line 123 */
int v7 = 0; // const/4 v7, 0x0
/* .line 127 */
} // :cond_5
} // :goto_2
/* throw v12 */
/* .line 120 */
/* .restart local v1 # "b":Landroid/graphics/Bitmap; */
/* .restart local v10 # "url":Ljava/net/URL; */
} // :cond_6
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 122 */
try { // :try_start_6
(( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_5 */
/* .line 123 */
int v7 = 0; // const/4 v7, 0x0
/* .line 134 */
} // .end local v1 # "b":Landroid/graphics/Bitmap;
} // .end local v10 # "url":Ljava/net/URL;
/* :catch_1 */
/* move-exception v3 */
/* .line 135 */
/* .restart local v3 # "e":Ljava/lang/Exception; */
final String v12 = "MOBFOX"; // const-string v12, "MOBFOX"
/* new-instance v13, Ljava/lang/StringBuilder; */
final String v14 = "Cannot fetch image:"; // const-string v14, "Cannot fetch image:"
/* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v13 ).append ( v0 ); // invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v12,v13,v3 );
/* .line 136 */
int v2 = 0; // const/4 v2, 0x0
/* .line 124 */
} // .end local v3 # "e":Ljava/lang/Exception;
/* .restart local v1 # "b":Landroid/graphics/Bitmap; */
/* .restart local v4 # "h":I */
/* .restart local v5 # "imageHeight":I */
/* .restart local v6 # "imageWidth":I */
/* .restart local v9 # "m":Landroid/util/DisplayMetrics; */
/* .restart local v10 # "url":Ljava/net/URL; */
/* .restart local v11 # "w":I */
/* :catch_2 */
/* move-exception v12 */
} // .end local v1 # "b":Landroid/graphics/Bitmap;
} // .end local v4 # "h":I
} // .end local v5 # "imageHeight":I
} // .end local v6 # "imageWidth":I
} // .end local v9 # "m":Landroid/util/DisplayMetrics;
} // .end local v10 # "url":Ljava/net/URL;
} // .end local v11 # "w":I
/* .restart local v3 # "e":Ljava/lang/Exception; */
/* :catch_3 */
/* move-exception v12 */
} // .end local v3 # "e":Ljava/lang/Exception;
/* :catch_4 */
/* move-exception v13 */
/* .restart local v1 # "b":Landroid/graphics/Bitmap; */
/* .restart local v10 # "url":Ljava/net/URL; */
/* :catch_5 */
/* move-exception v12 */
} // .end method
private void setImageDrawable ( android.widget.ImageView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/widget/ImageView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 73 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/mobfox/video/sdk/NavIcon$1; */
/* invoke-direct {v1, p0, p2, p1}, Lcom/mobfox/video/sdk/NavIcon$1;-><init>(Lcom/mobfox/video/sdk/NavIcon;Ljava/lang/String;Landroid/widget/ImageView;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 91 */
/* .local v0, "t":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 92 */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 9 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 143 */
try { // :try_start_0
v6 = this.mContext;
/* instance-of v6, v6, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 144 */
v0 = this.mContext;
/* check-cast v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .line 145 */
/* .local v0, "activity":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
v6 = this.mIcon;
/* iget v6, v6, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v6, v7, :cond_1 */
/* .line 146 */
/* new-instance v3, Landroid/content/Intent; */
final String v6 = "android.intent.action.VIEW"; // const-string v6, "android.intent.action.VIEW"
/* .line 147 */
v7 = this.mIcon;
v7 = this.clickUrl;
android.net.Uri .parse ( v7 );
/* .line 146 */
/* invoke-direct {v3, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 148 */
/* .local v3, "intent":Landroid/content/Intent; */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).startActivity ( v3 ); // invoke-virtual {v0, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* .line 217 */
} // .end local v0 # "activity":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;
} // .end local v3 # "intent":Landroid/content/Intent;
} // :cond_0
} // :goto_0
return;
/* .line 150 */
/* .restart local v0 # "activity":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // :cond_1
v6 = this.mIcon;
v5 = this.clickUrl;
/* .line 151 */
/* .local v5, "url":Ljava/lang/String; */
final String v6 = "market:"; // const-string v6, "market:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 152 */
final String v6 = "http://market.android.com"; // const-string v6, "http://market.android.com"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 153 */
final String v6 = "sms:"; // const-string v6, "sms:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
final String v6 = "tel:"; // const-string v6, "tel:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 154 */
final String v6 = "mailto:"; // const-string v6, "mailto:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 155 */
final String v6 = "voicemail:"; // const-string v6, "voicemail:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 156 */
final String v6 = "geo:"; // const-string v6, "geo:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 157 */
final String v6 = "google.streetview:"; // const-string v6, "google.streetview:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 158 */
} // :cond_2
/* new-instance v3, Landroid/content/Intent; */
final String v6 = "android.intent.action.VIEW"; // const-string v6, "android.intent.action.VIEW"
/* .line 159 */
android.net.Uri .parse ( v5 );
/* .line 158 */
/* invoke-direct {v3, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 160 */
/* .restart local v3 # "intent":Landroid/content/Intent; */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).startActivity ( v3 ); // invoke-virtual {v0, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 214 */
} // .end local v0 # "activity":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;
} // .end local v3 # "intent":Landroid/content/Intent;
} // .end local v5 # "url":Ljava/lang/String;
/* :catch_0 */
/* move-exception v2 */
/* .line 215 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "Couldn\'t open URL: "; // const-string v8, "Couldn\'t open URL: "
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v8 = this.mIcon;
v8 = this.clickUrl;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v6,v7 );
/* .line 164 */
} // .end local v2 # "e":Ljava/lang/Exception;
/* .restart local v0 # "activity":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .restart local v5 # "url":Ljava/lang/String; */
} // :cond_3
try { // :try_start_1
final String v6 = "mfox:external:"; // const-string v6, "mfox:external:"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 165 */
/* const/16 v6, 0x10 */
(( java.lang.String ) v5 ).substring ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 166 */
/* new-instance v3, Landroid/content/Intent; */
/* .line 167 */
final String v6 = "android.intent.action.VIEW"; // const-string v6, "android.intent.action.VIEW"
android.net.Uri .parse ( v5 );
/* .line 166 */
/* invoke-direct {v3, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 168 */
/* .restart local v3 # "intent":Landroid/content/Intent; */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).startActivity ( v3 ); // invoke-virtual {v0, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* goto/16 :goto_0 */
/* .line 171 */
} // .end local v3 # "intent":Landroid/content/Intent;
} // :cond_4
final String v6 = "mfox:replayvideo"; // const-string v6, "mfox:replayvideo"
(( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* :try_end_1 */
v6 = /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 173 */
try { // :try_start_2
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 174 */
/* .local v1, "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;" */
final String v6 = "replayVideo"; // const-string v6, "replayVideo"
int v7 = 0; // const/4 v7, 0x0
/* new-array v7, v7, [Ljava/lang/Class; */
(( java.lang.Class ) v1 ).getMethod ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 175 */
/* .local v4, "method":Ljava/lang/reflect/Method; */
int v6 = 0; // const/4 v6, 0x0
/* new-array v6, v6, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v4 ).invoke ( v0, v6 ); // invoke-virtual {v4, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* goto/16 :goto_0 */
/* .line 176 */
} // .end local v1 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;"
} // .end local v4 # "method":Ljava/lang/reflect/Method;
/* :catch_1 */
/* move-exception v2 */
/* .line 177 */
/* .local v2, "e":Ljava/lang/NoSuchMethodException; */
try { // :try_start_3
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
int v7 = 3; // const/4 v7, 0x3
v6 = android.util.Log .isLoggable ( v6,v7 );
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 178 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* .line 179 */
final String v7 = "Your activity class has no replayVideo method"; // const-string v7, "Your activity class has no replayVideo method"
/* .line 178 */
android.util.Log .d ( v6,v7 );
/* goto/16 :goto_0 */
/* .line 181 */
} // .end local v2 # "e":Ljava/lang/NoSuchMethodException;
/* :catch_2 */
/* move-exception v2 */
/* .line 182 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
int v7 = 3; // const/4 v7, 0x3
v6 = android.util.Log .isLoggable ( v6,v7 );
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 183 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* .line 184 */
final String v7 = "Couldn\'t run replayVideo method in your Activity"; // const-string v7, "Couldn\'t run replayVideo method in your Activity"
/* .line 183 */
android.util.Log .d ( v6,v7 );
/* goto/16 :goto_0 */
/* .line 189 */
} // .end local v2 # "e":Ljava/lang/Exception;
} // :cond_5
final String v6 = "mfox:playvideo"; // const-string v6, "mfox:playvideo"
(( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* :try_end_3 */
v6 = /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 191 */
try { // :try_start_4
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 192 */
/* .restart local v1 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;" */
final String v6 = "playVideo"; // const-string v6, "playVideo"
int v7 = 0; // const/4 v7, 0x0
/* new-array v7, v7, [Ljava/lang/Class; */
(( java.lang.Class ) v1 ).getMethod ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 193 */
/* .restart local v4 # "method":Ljava/lang/reflect/Method; */
int v6 = 0; // const/4 v6, 0x0
/* new-array v6, v6, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v4 ).invoke ( v0, v6 ); // invoke-virtual {v4, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_4 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_4 ..:try_end_4} :catch_3 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_4 */
/* goto/16 :goto_0 */
/* .line 194 */
} // .end local v1 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;"
} // .end local v4 # "method":Ljava/lang/reflect/Method;
/* :catch_3 */
/* move-exception v2 */
/* .line 195 */
/* .local v2, "e":Ljava/lang/NoSuchMethodException; */
try { // :try_start_5
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
int v7 = 3; // const/4 v7, 0x3
v6 = android.util.Log .isLoggable ( v6,v7 );
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 196 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* .line 197 */
final String v7 = "Your activity class has no playVideo method"; // const-string v7, "Your activity class has no playVideo method"
/* .line 196 */
android.util.Log .d ( v6,v7 );
/* goto/16 :goto_0 */
/* .line 199 */
} // .end local v2 # "e":Ljava/lang/NoSuchMethodException;
/* :catch_4 */
/* move-exception v2 */
/* .line 200 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
int v7 = 3; // const/4 v7, 0x3
v6 = android.util.Log .isLoggable ( v6,v7 );
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 201 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* .line 202 */
final String v7 = "Couldn\'t run replayVideo method in your Activity"; // const-string v7, "Couldn\'t run replayVideo method in your Activity"
/* .line 201 */
android.util.Log .d ( v6,v7 );
/* goto/16 :goto_0 */
/* .line 207 */
} // .end local v2 # "e":Ljava/lang/Exception;
} // :cond_6
final String v6 = "mfox:skip"; // const-string v6, "mfox:skip"
v6 = (( java.lang.String ) v5 ).startsWith ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 208 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* goto/16 :goto_0 */
/* .line 211 */
} // :cond_7
v6 = this.mIcon;
v6 = this.clickUrl;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).navigate ( v6 ); // invoke-virtual {v0, v6}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->navigate(Ljava/lang/String;)V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_0 */
/* goto/16 :goto_0 */
} // .end method
