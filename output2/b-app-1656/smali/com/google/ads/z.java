public class com.google.ads.z implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 private static final com.google.ads.internal.a a;
	 /* # direct methods */
	 static com.google.ads.z ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 v0 = com.google.ads.internal.a.a;
		 /* check-cast v0, Lcom/google/ads/internal/a; */
		 return;
	 } // .end method
	 public com.google.ads.z ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Integer a ( java.util.HashMap p0, java.lang.String p1, Integer p2, android.util.DisplayMetrics p3 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Ljava/lang/String;", */
		 /* "I", */
		 /* "Landroid/util/DisplayMetrics;", */
		 /* ")I" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 50 */
	 (( java.util.HashMap ) p1 ).get ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 52 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 54 */
		 int v1 = 1; // const/4 v1, 0x1
		 try { // :try_start_0
			 v2 = 			 java.lang.Integer .parseInt ( v0 );
			 /* int-to-float v2, v2 */
			 android.util.TypedValue .applyDimension ( v1,v2,p4 );
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* float-to-int p3, v0 */
			 /* .line 61 */
		 } // :cond_0
	 } // :goto_0
	 /* .line 57 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 58 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Could not parse \""; // const-string v2, "Could not parse \""
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\" in a video gmsg: "; // const-string v2, "\" in a video gmsg: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
} // .end method
public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
	 /* .locals 9 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lcom/google/ads/internal/d;", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;", */
	 /* "Landroid/webkit/WebView;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .prologue */
int v7 = -1; // const/4 v7, -0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 72 */
final String v0 = "action"; // const-string v0, "action"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 73 */
/* if-nez v0, :cond_0 */
/* .line 74 */
final String v0 = "No \"action\" parameter in a video gmsg."; // const-string v0, "No \"action\" parameter in a video gmsg."
com.google.ads.util.b .a ( v0 );
/* .line 170 */
} // :goto_0
return;
/* .line 80 */
} // :cond_0
/* instance-of v1, p3, Lcom/google/ads/internal/AdWebView; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 81 */
/* check-cast p3, Lcom/google/ads/internal/AdWebView; */
/* .line 88 */
(( com.google.ads.internal.AdWebView ) p3 ).d ( ); // invoke-virtual {p3}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
/* .line 89 */
/* if-nez v1, :cond_2 */
/* .line 90 */
final String v0 = "Could not get adActivity for a video gmsg."; // const-string v0, "Could not get adActivity for a video gmsg."
com.google.ads.util.b .a ( v0 );
/* .line 83 */
} // :cond_1
final String v0 = "Could not get adWebView for a video gmsg."; // const-string v0, "Could not get adWebView for a video gmsg."
com.google.ads.util.b .a ( v0 );
/* .line 95 */
} // :cond_2
final String v2 = "new"; // const-string v2, "new"
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 96 */
final String v3 = "position"; // const-string v3, "position"
v3 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 97 */
/* if-nez v2, :cond_3 */
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 99 */
} // :cond_3
com.google.ads.util.AdUtil .a ( v1 );
/* .line 100 */
final String v3 = "x"; // const-string v3, "x"
v3 = (( com.google.ads.z ) p0 ).a ( p2, v3, v4, v0 ); // invoke-virtual {p0, p2, v3, v4, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 101 */
final String v5 = "y"; // const-string v5, "y"
v4 = (( com.google.ads.z ) p0 ).a ( p2, v5, v4, v0 ); // invoke-virtual {p0, p2, v5, v4, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 102 */
final String v5 = "w"; // const-string v5, "w"
v5 = (( com.google.ads.z ) p0 ).a ( p2, v5, v7, v0 ); // invoke-virtual {p0, p2, v5, v7, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 103 */
final String v6 = "h"; // const-string v6, "h"
v0 = (( com.google.ads.z ) p0 ).a ( p2, v6, v7, v0 ); // invoke-virtual {p0, p2, v6, v7, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 105 */
if ( v2 != null) { // if-eqz v2, :cond_4
(( com.google.ads.AdActivity ) v1 ).getAdVideoView ( ); // invoke-virtual {v1}, Lcom/google/ads/AdActivity;->getAdVideoView()Lcom/google/ads/internal/AdVideoView;
/* if-nez v2, :cond_4 */
/* .line 106 */
(( com.google.ads.AdActivity ) v1 ).newAdVideoView ( v3, v4, v5, v0 ); // invoke-virtual {v1, v3, v4, v5, v0}, Lcom/google/ads/AdActivity;->newAdVideoView(IIII)V
/* .line 108 */
} // :cond_4
(( com.google.ads.AdActivity ) v1 ).moveAdVideoView ( v3, v4, v5, v0 ); // invoke-virtual {v1, v3, v4, v5, v0}, Lcom/google/ads/AdActivity;->moveAdVideoView(IIII)V
/* .line 112 */
} // :cond_5
(( com.google.ads.AdActivity ) v1 ).getAdVideoView ( ); // invoke-virtual {v1}, Lcom/google/ads/AdActivity;->getAdVideoView()Lcom/google/ads/internal/AdVideoView;
/* .line 113 */
/* if-nez v8, :cond_6 */
/* .line 115 */
v0 = com.google.ads.z.a;
final String v1 = "onVideoEvent"; // const-string v1, "onVideoEvent"
final String v2 = "{\'event\': \'error\', \'what\': \'no_video_view\'}"; // const-string v2, "{\'event\': \'error\', \'what\': \'no_video_view\'}"
(( com.google.ads.internal.a ) v0 ).a ( p3, v1, v2 ); // invoke-virtual {v0, p3, v1, v2}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 121 */
} // :cond_6
final String v2 = "click"; // const-string v2, "click"
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 122 */
com.google.ads.util.AdUtil .a ( v1 );
/* .line 123 */
final String v1 = "x"; // const-string v1, "x"
v2 = (( com.google.ads.z ) p0 ).a ( p2, v1, v4, v0 ); // invoke-virtual {p0, p2, v1, v4, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 124 */
final String v1 = "y"; // const-string v1, "y"
v3 = (( com.google.ads.z ) p0 ).a ( p2, v1, v4, v0 ); // invoke-virtual {p0, p2, v1, v4, v0}, Lcom/google/ads/z;->a(Ljava/util/HashMap;Ljava/lang/String;ILandroid/util/DisplayMetrics;)I
/* .line 127 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* .line 128 */
/* int-to-float v5, v2 */
/* int-to-float v6, v3 */
/* move-wide v2, v0 */
/* move v7, v4 */
/* invoke-static/range {v0 ..v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
/* .line 129 */
(( com.google.ads.internal.AdVideoView ) v8 ).a ( v0 ); // invoke-virtual {v8, v0}, Lcom/google/ads/internal/AdVideoView;->a(Landroid/view/MotionEvent;)V
/* goto/16 :goto_0 */
/* .line 130 */
} // :cond_7
final String v1 = "controls"; // const-string v1, "controls"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 131 */
final String v0 = "enabled"; // const-string v0, "enabled"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 132 */
/* if-nez v0, :cond_8 */
/* .line 133 */
final String v0 = "No \"enabled\" parameter in a controls video gmsg."; // const-string v0, "No \"enabled\" parameter in a controls video gmsg."
com.google.ads.util.b .a ( v0 );
/* goto/16 :goto_0 */
/* .line 136 */
} // :cond_8
final String v1 = "true"; // const-string v1, "true"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 137 */
int v0 = 1; // const/4 v0, 0x1
(( com.google.ads.internal.AdVideoView ) v8 ).setMediaControllerEnabled ( v0 ); // invoke-virtual {v8, v0}, Lcom/google/ads/internal/AdVideoView;->setMediaControllerEnabled(Z)V
/* goto/16 :goto_0 */
/* .line 139 */
} // :cond_9
(( com.google.ads.internal.AdVideoView ) v8 ).setMediaControllerEnabled ( v4 ); // invoke-virtual {v8, v4}, Lcom/google/ads/internal/AdVideoView;->setMediaControllerEnabled(Z)V
/* goto/16 :goto_0 */
/* .line 141 */
} // :cond_a
final String v1 = "currentTime"; // const-string v1, "currentTime"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 142 */
final String v0 = "time"; // const-string v0, "time"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 143 */
/* if-nez v0, :cond_b */
/* .line 144 */
final String v0 = "No \"time\" parameter in a currentTime video gmsg."; // const-string v0, "No \"time\" parameter in a currentTime video gmsg."
com.google.ads.util.b .a ( v0 );
/* goto/16 :goto_0 */
/* .line 148 */
} // :cond_b
try { // :try_start_0
v1 = java.lang.Float .parseFloat ( v0 );
/* .line 149 */
/* const/high16 v2, 0x447a0000 # 1000.0f */
/* mul-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* .line 150 */
(( com.google.ads.internal.AdVideoView ) v8 ).a ( v1 ); // invoke-virtual {v8, v1}, Lcom/google/ads/internal/AdVideoView;->a(I)V
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 151 */
/* :catch_0 */
/* move-exception v1 */
/* .line 152 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Could not parse \"time\" parameter: "; // const-string v2, "Could not parse \"time\" parameter: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* goto/16 :goto_0 */
/* .line 154 */
} // :cond_c
final String v1 = "hide"; // const-string v1, "hide"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 155 */
int v0 = 4; // const/4 v0, 0x4
(( com.google.ads.internal.AdVideoView ) v8 ).setVisibility ( v0 ); // invoke-virtual {v8, v0}, Lcom/google/ads/internal/AdVideoView;->setVisibility(I)V
/* goto/16 :goto_0 */
/* .line 156 */
} // :cond_d
final String v1 = "load"; // const-string v1, "load"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_e
/* .line 157 */
(( com.google.ads.internal.AdVideoView ) v8 ).b ( ); // invoke-virtual {v8}, Lcom/google/ads/internal/AdVideoView;->b()V
/* goto/16 :goto_0 */
/* .line 158 */
} // :cond_e
final String v1 = "pause"; // const-string v1, "pause"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_f
/* .line 159 */
(( com.google.ads.internal.AdVideoView ) v8 ).c ( ); // invoke-virtual {v8}, Lcom/google/ads/internal/AdVideoView;->c()V
/* goto/16 :goto_0 */
/* .line 160 */
} // :cond_f
final String v1 = "play"; // const-string v1, "play"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_10
/* .line 161 */
(( com.google.ads.internal.AdVideoView ) v8 ).d ( ); // invoke-virtual {v8}, Lcom/google/ads/internal/AdVideoView;->d()V
/* goto/16 :goto_0 */
/* .line 162 */
} // :cond_10
final String v1 = "show"; // const-string v1, "show"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 163 */
(( com.google.ads.internal.AdVideoView ) v8 ).setVisibility ( v4 ); // invoke-virtual {v8, v4}, Lcom/google/ads/internal/AdVideoView;->setVisibility(I)V
/* goto/16 :goto_0 */
/* .line 164 */
} // :cond_11
final String v1 = "src"; // const-string v1, "src"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_12
/* .line 165 */
final String v0 = "src"; // const-string v0, "src"
(( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
(( com.google.ads.internal.AdVideoView ) v8 ).setSrc ( v0 ); // invoke-virtual {v8, v0}, Lcom/google/ads/internal/AdVideoView;->setSrc(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 167 */
} // :cond_12
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown video action: "; // const-string v2, "Unknown video action: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* goto/16 :goto_0 */
} // .end method
