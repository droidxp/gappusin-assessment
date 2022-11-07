class de.nurogames.android.ticb.base.objects.objTerrainMap$1 extends java.lang.Thread {
	 /* .source "objTerrainMap.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/objects/objTerrainMap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.objects.objTerrainMap this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.objects.objTerrainMap$1 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 478 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 480 */
} // :cond_0
/* const/16 v1, 0xa */
/* if-gt v0, v1, :cond_1 */
/* .line 487 */
return;
/* .line 481 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
int v1 = 0; // const/4 v1, 0x0
(( java.util.Vector ) v0 ).removeElementAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->removeElementAt(I)V
/* .line 482 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 483 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap .access$0 ( v1 );
/* if-ge v0, v1, :cond_0 */
/* .line 484 */
v0 = this.this$0;
de.nurogames.android.ticb.base.objects.objTerrainMap .access$1 ( v0 );
} // .end method
