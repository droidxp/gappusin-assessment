class de.nurogames.android.ticb.base.objects.objBee$1 extends java.lang.Thread {
	 /* .source "objBee.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/objects/objBee; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.objects.objBee this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.objects.objBee$1 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 182 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 186 */
v2 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
v3 = de.nurogames.android.ticb.base.core.VectorMath .calculateAngleToOrigin ( v3 );
de.nurogames.android.ticb.base.objects.objBee .access$0 ( v2,v3 );
/* .line 188 */
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objBee .access$1 ( v2 );
v3 = de.nurogames.android.ticb.base.objects.objBee .access$2 ( );
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_2 */
/* .line 189 */
v2 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objBee .access$2 ( );
de.nurogames.android.ticb.base.objects.objBee .access$0 ( v2,v3 );
/* .line 193 */
} // :cond_0
} // :goto_0
v2 = this.this$0;
v3 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objBee .access$1 ( v3 );
v4 = this.this$0;
v4 = de.nurogames.android.ticb.base.objects.objBee .access$4 ( v4 );
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* add-int/lit8 v3, v3, 0x9 */
de.nurogames.android.ticb.base.objects.objBee .access$5 ( v2,v3 );
/* .line 196 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* if-ne v2, v0, :cond_4 */
/* .line 197 */
} // :cond_1
v2 = this.this$0;
v3 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objBee .access$6 ( v3 );
/* if-nez v3, :cond_3 */
} // :goto_1
de.nurogames.android.ticb.base.objects.objBee .access$7 ( v2,v0 );
/* .line 202 */
} // :goto_2
return;
/* .line 190 */
} // :cond_2
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objBee .access$1 ( v2 );
v3 = de.nurogames.android.ticb.base.objects.objBee .access$3 ( );
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_0 */
/* .line 191 */
v2 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objBee .access$3 ( );
de.nurogames.android.ticb.base.objects.objBee .access$0 ( v2,v3 );
} // :cond_3
/* move v0, v1 */
/* .line 197 */
/* .line 199 */
} // :cond_4
v0 = this.this$0;
de.nurogames.android.ticb.base.objects.objBee .access$7 ( v0,v1 );
} // .end method
