class com.ansca.corona.CameraView$1 extends android.view.OrientationEventListener {
	 /* .source "CameraView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CameraView;-><init>(Landroid/content/Context;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CameraView this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CameraView$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Landroid/content/Context; */
/* .prologue */
/* .line 52 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V */
return;
} // .end method
/* # virtual methods */
public void onOrientationChanged ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "orientationInDegrees" # I */
/* .prologue */
/* const/16 v2, 0xe1 */
/* const/16 v1, 0x87 */
/* .line 56 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_0 */
/* .line 77 */
} // :goto_0
return;
/* .line 62 */
} // :cond_0
/* rsub-int v0, p1, 0x168 */
/* rem-int/lit16 p1, v0, 0x168 */
/* .line 65 */
/* const/16 v0, 0x2d */
/* if-lt p1, v0, :cond_1 */
/* if-ge p1, v1, :cond_1 */
/* .line 66 */
v0 = this.this$0;
/* const/16 v1, 0x5a */
com.ansca.corona.CameraView .access$002 ( v0,v1 );
/* .line 68 */
} // :cond_1
/* if-lt p1, v1, :cond_2 */
/* if-ge p1, v2, :cond_2 */
/* .line 69 */
v0 = this.this$0;
/* const/16 v1, 0xb4 */
com.ansca.corona.CameraView .access$002 ( v0,v1 );
/* .line 71 */
} // :cond_2
/* if-lt p1, v2, :cond_3 */
/* const/16 v0, 0x13b */
/* if-ge p1, v0, :cond_3 */
/* .line 72 */
v0 = this.this$0;
/* const/16 v1, 0x10e */
com.ansca.corona.CameraView .access$002 ( v0,v1 );
/* .line 75 */
} // :cond_3
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.ansca.corona.CameraView .access$002 ( v0,v1 );
} // .end method
