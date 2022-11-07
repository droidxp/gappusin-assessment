class de.nurogames.android.ticb.base.objects.objAnimMenuBackground$1 extends java.lang.Thread {
	 /* .source "objAnimMenuBackground.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.objects.objAnimMenuBackground this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.objects.objAnimMenuBackground$1 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 114 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 117 */
v1 = this.this$0;
/* const/high16 v2, 0x41200000 # 10.0f */
/* iput v2, v1, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->x:F */
/* .line 118 */
v1 = this.this$0;
v2 = this.this$0;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->x:F */
/* const/high16 v3, 0x40400000 # 3.0f */
/* div-float/2addr v2, v3 */
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$0 ( v1,v2 );
/* .line 119 */
v1 = this.this$0;
v2 = this.this$0;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->x:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$1 ( v1,v2 );
/* .line 122 */
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$2 ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$3 ( v2 );
/* add-float/2addr v1, v2 */
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$4 ( v2 );
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* .line 123 */
v1 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$2 ( v1 );
v3 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$3 ( v3 );
/* add-float/2addr v2, v3 */
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$5 ( v1,v2 );
/* .line 127 */
} // :goto_0
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$6 ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$7 ( v2 );
/* add-float/2addr v1, v2 */
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$4 ( v2 );
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 128 */
v1 = this.this$0;
v2 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$6 ( v1 );
v3 = this.this$0;
v3 = de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$7 ( v3 );
/* add-float/2addr v2, v3 */
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$8 ( v1,v2 );
/* .line 132 */
} // :goto_1
v1 = this.this$0;
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$9 ( v1 );
/* array-length v3, v2 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
/* if-lt v1, v3, :cond_2 */
/* .line 135 */
return;
/* .line 124 */
} // :cond_0
v1 = this.this$0;
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$5 ( v1,v4 );
/* .line 129 */
} // :cond_1
v1 = this.this$0;
de.nurogames.android.ticb.base.objects.objAnimMenuBackground .access$8 ( v1,v4 );
/* .line 132 */
} // :cond_2
/* aget-object v0, v2, v1 */
/* .line 133 */
/* .local v0, "c":Lde/nurogames/android/ticb/base/objects/objCloud; */
(( de.nurogames.android.ticb.base.objects.objCloud ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objCloud;->animate()V
/* .line 132 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
