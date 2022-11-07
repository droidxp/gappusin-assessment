class com.mobfox.video.sdk.MobFoxRichMediaActivity$11 implements com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$11 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 935 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onTimeEvent ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "time" # I */
/* .prologue */
/* .line 939 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 940 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "###########CAN CLOSE VIDEO:"; // const-string v2, "###########CAN CLOSE VIDEO:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 942 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$14 ( v0,v1 );
/* .line 943 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$8 ( v0 );
/* iget-boolean v0, v0, Lcom/mobfox/video/sdk/VideoData;->showSkipButton:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 945 */
		 v0 = this.this$0;
		 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$1 ( v1 );
		 /* .line 946 */
		 /* const/16 v2, -0x12 */
		 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
		 /* .line 945 */
		 (( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 950 */
		 v0 = this.this$0;
		 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
		 /* .line 952 */
	 } // :cond_1
	 return;
} // .end method
