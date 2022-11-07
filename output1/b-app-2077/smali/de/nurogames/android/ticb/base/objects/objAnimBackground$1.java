class de.nurogames.android.ticb.base.objects.objAnimBackground$1 extends java.lang.Thread {
	 /* .source "objAnimBackground.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/objects/objAnimBackground; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.objects.objAnimBackground this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.objects.objAnimBackground$1 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 120 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 123 */
v1 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
de.nurogames.android.ticb.base.objects.objAnimBackground .access$0 ( v1,v2 );
/* .line 124 */
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$1 ( v1 );
/* const/high16 v2, 0x40400000 # 3.0f */
/* div-float/2addr v1, v2 */
de.nurogames.android.ticb.base.objects.objAnimBackground .access$2 ( v1 );
/* .line 125 */
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$1 ( v1 );
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
de.nurogames.android.ticb.base.objects.objAnimBackground .access$3 ( v1 );
/* .line 128 */
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$4 ( );
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$5 ( );
/* add-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$6 ( );
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* .line 129 */
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$4 ( );
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$5 ( );
/* add-float/2addr v1, v2 */
de.nurogames.android.ticb.base.objects.objAnimBackground .access$7 ( v1 );
/* .line 132 */
} // :goto_0
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$8 ( );
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$9 ( );
/* add-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$6 ( );
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 133 */
v1 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$8 ( );
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground .access$9 ( );
/* add-float/2addr v1, v2 */
de.nurogames.android.ticb.base.objects.objAnimBackground .access$10 ( v1 );
/* .line 137 */
} // :goto_1
de.nurogames.android.ticb.base.objects.objAnimBackground .access$11 ( );
/* array-length v3, v2 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
/* if-lt v1, v3, :cond_2 */
/* .line 140 */
return;
/* .line 130 */
} // :cond_0
de.nurogames.android.ticb.base.objects.objAnimBackground .access$7 ( v3 );
/* .line 134 */
} // :cond_1
de.nurogames.android.ticb.base.objects.objAnimBackground .access$10 ( v3 );
/* .line 137 */
} // :cond_2
/* aget-object v0, v2, v1 */
/* .line 138 */
/* .local v0, "c":Lde/nurogames/android/ticb/base/objects/objCloud; */
(( de.nurogames.android.ticb.base.objects.objCloud ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objCloud;->animate()V
/* .line 137 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
