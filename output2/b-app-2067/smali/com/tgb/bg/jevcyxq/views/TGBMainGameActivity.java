public class com.tgb.bg.jevcyxq.views.TGBMainGameActivity extends com.tgb.bg.jevcyxq.refurbished.TGBLayoutGameActivity {
	 /* # instance fields */
	 android.widget.RelativeLayout a;
	 public Boolean b;
	 public android.widget.Button c;
	 private Integer d;
	 private Integer e;
	 private Float f;
	 private com.google.ads.AdView g;
	 private org.anddev.andengine.engine.Engine h;
	 private org.anddev.andengine.engine.camera.Camera i;
	 private org.anddev.andengine.entity.scene.Scene j;
	 private Boolean k;
	 private Boolean l;
	 private com.tgb.bg.jevcyxq.c.w m;
	 private com.tgb.bg.jevcyxq.c.a n;
	 private com.tgb.bg.jevcyxq.c.g o;
	 private com.tgb.bg.jevcyxq.c.h p;
	 private com.tgb.bg.jevcyxq.c.y q;
	 private com.tgb.bg.jevcyxq.c.ac r;
	 private com.tgb.bg.jevcyxq.c.aa s;
	 private com.tgb.bg.jevcyxq.c.z t;
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.views.TGBMainGameActivity ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;-><init>()V */
		 /* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
		 /* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->k:Z */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l:Z */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->b:Z */
		 return;
	 } // .end method
	 static Float a ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
	 } // .end method
	 static void a ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0, Float p1 ) { //synthethic
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
		 return;
	 } // .end method
	 static com.tgb.bg.jevcyxq.c.g b ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.o;
	 } // .end method
	 static Boolean c ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->k:Z */
	 } // .end method
	 static com.tgb.bg.jevcyxq.c.z d ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.t;
	 } // .end method
	 static Boolean e ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l:Z */
	 } // .end method
	 static org.anddev.andengine.engine.Engine f ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.h;
	 } // .end method
	 static Integer g ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
	 } // .end method
	 static com.tgb.bg.jevcyxq.c.ac h ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.r;
	 } // .end method
	 static com.google.ads.AdView i ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.g;
	 } // .end method
	 static Integer j ( com.tgb.bg.jevcyxq.views.TGBMainGameActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
	 } // .end method
	 private void t ( ) {
		 /* .locals 7 */
		 int v6 = 7; // const/4 v6, 0x7
		 int v5 = 6; // const/4 v5, 0x6
		 int v4 = 5; // const/4 v4, 0x5
		 int v2 = 2; // const/4 v2, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "LAYER_TRAIN = "; // const-string v1, "LAYER_TRAIN = "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v1 = this.j;
		 v1 = 		 (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v4 ); // invoke-virtual {v1, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v0 = this.j;
		 v0 = 		 (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
		 /* sub-int/2addr v0, v3 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v1 = "LAYER_LAND_TILES= "; // const-string v1, "LAYER_LAND_TILES= "
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v1 = this.j;
	 v1 = 	 (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 v0 = this.j;
	 v0 = 	 (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
	 /* sub-int/2addr v0, v3 */
} // :goto_1
/* if-gez v0, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "LAYER_SMOKE = "; // const-string v1, "LAYER_SMOKE = "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.j;
v1 = (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v5 ); // invoke-virtual {v0, v5}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v3 */
} // :goto_2
/* if-gez v0, :cond_2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "LAYER_FINISH_START_WRAPER = "; // const-string v1, "LAYER_FINISH_START_WRAPER = "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.j;
v1 = (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v6 ); // invoke-virtual {v1, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v3 */
} // :goto_3
/* if-gez v0, :cond_3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "LAYER_TRAINING_TEXT= "; // const-string v1, "LAYER_TRAINING_TEXT= "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.j;
/* const/16 v2, 0x8 */
v1 = (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
/* const/16 v1, 0x8 */
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v3 */
} // :goto_4
/* if-gez v0, :cond_4 */
v0 = this.j;
int v1 = 3; // const/4 v1, 0x3
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v3 */
} // :goto_5
/* if-gez v0, :cond_5 */
return;
} // :cond_0
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v4 ); // invoke-virtual {v1, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
/* goto/16 :goto_0 */
} // :cond_1
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
/* goto/16 :goto_1 */
} // :cond_2
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
/* goto/16 :goto_2 */
} // :cond_3
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v6 ); // invoke-virtual {v1, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_4
v1 = this.j;
/* const/16 v2, 0x8 */
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_5
v1 = this.j;
int v2 = 3; // const/4 v2, 0x3
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iput p2, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
/* iput p1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
v0 = this.a;
(( android.widget.RelativeLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
/* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l:Z */
v0 = this.c;
(( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->i()V
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x2710 */
try { // :try_start_0
v0 = org.anddev.andengine.util.MathUtils .random ( v0,v1 );
/* const/16 v1, 0x1388 */
/* if-ge v0, v1, :cond_0 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/tgb/bg/jevcyxq/views/LBAds; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
/* new-instance v0, Lcom/tgb/bg/jevcyxq/views/x; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/tgb/bg/jevcyxq/views/x;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;II)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).runOnUpdateThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUpdateThread(Ljava/lang/Runnable;)V
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public final Float b ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
} // .end method
public final Integer c ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
} // .end method
public final org.anddev.andengine.engine.camera.Camera d ( ) {
/* .locals 1 */
v0 = this.i;
} // .end method
public final org.anddev.andengine.entity.scene.Scene e ( ) {
/* .locals 1 */
v0 = this.j;
} // .end method
public final com.tgb.bg.jevcyxq.c.h f ( ) {
/* .locals 1 */
v0 = this.p;
} // .end method
public final com.tgb.bg.jevcyxq.c.w g ( ) {
/* .locals 1 */
v0 = this.m;
} // .end method
public org.anddev.andengine.engine.Engine getEngine ( ) {
/* .locals 1 */
v0 = this.h;
} // .end method
protected Integer getLayoutID ( ) {
/* .locals 1 */
/* const v0, 0x7f030006 */
} // .end method
protected Integer getRenderSurfaceViewID ( ) {
/* .locals 1 */
/* const v0, 0x7f070056 */
} // .end method
public final com.tgb.bg.jevcyxq.c.a h ( ) {
/* .locals 1 */
v0 = this.n;
} // .end method
public final com.tgb.bg.jevcyxq.c.z i ( ) {
/* .locals 1 */
v0 = this.t;
} // .end method
public final com.tgb.bg.jevcyxq.c.g j ( ) {
/* .locals 1 */
v0 = this.o;
} // .end method
public final com.tgb.bg.jevcyxq.c.y k ( ) {
/* .locals 1 */
v0 = this.q;
} // .end method
public final com.tgb.bg.jevcyxq.c.ac l ( ) {
/* .locals 1 */
v0 = this.r;
} // .end method
public final com.tgb.bg.jevcyxq.c.aa m ( ) {
/* .locals 1 */
v0 = this.s;
} // .end method
protected final android.view.View n ( ) {
/* .locals 1 */
/* const/high16 v0, 0x7f070000 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->findViewById(I)Landroid/view/View;
} // .end method
final void o ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->k:Z */
v0 = this.r;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "LEVELS"; // const-string v2, "LEVELS"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = (( com.tgb.bg.jevcyxq.c.ac ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->b(Ljava/lang/String;)I
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
/* if-ne v0, v1, :cond_0 */
v0 = this.r;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
/* add-int/lit8 v1, v1, 0x1 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "LEVELS"; // const-string v3, "LEVELS"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.tgb.bg.jevcyxq.c.ac ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/c/ac;->b(ILjava/lang/String;)V
} // :cond_0
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->g()V
v0 = this.j;
/* new-instance v1, Lorg/anddev/andengine/entity/modifier/DelayModifier; */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/views/y; */
/* invoke-direct {v3, p0}, Lcom/tgb/bg/jevcyxq/views/y;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
/* invoke-direct {v1, v2, v3}, Lorg/anddev/andengine/entity/modifier/DelayModifier;-><init>(FLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
(( org.anddev.andengine.entity.scene.Scene ) v0 ).registerEntityModifier ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onCreate(Landroid/os/Bundle;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
final String v1 = "EPIDOSE_NO"; // const-string v1, "EPIDOSE_NO"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* iput v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
final String v1 = "LEVEL_NO"; // const-string v1, "LEVEL_NO"
v0 = (( android.os.Bundle ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->b:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l:Z */
/* const v0, 0x7f070057 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
this.a = v0;
/* const v0, 0x7f070058 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.c = v0;
v0 = this.c;
/* new-instance v1, Lcom/tgb/bg/jevcyxq/views/k; */
/* invoke-direct {v1, p0}, Lcom/tgb/bg/jevcyxq/views/k;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* const v0, 0x7f070059 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->findViewById(I)Landroid/view/View;
/* check-cast p0, Landroid/widget/RelativeLayout; */
/* const/16 v0, 0x8 */
(( android.widget.RelativeLayout ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
protected void onDestroy ( ) {
/* .locals 7 */
int v6 = 4; // const/4 v6, 0x4
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onDestroy()V */
v0 = this.m;
(( com.tgb.bg.jevcyxq.c.w ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/w;->b()V
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->f()V
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "LAYER_BACKGROUND= "; // const-string v1, "LAYER_BACKGROUND= "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.j;
int v2 = 7; // const/4 v2, 0x7
v1 = (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v5 */
} // :goto_0
/* if-gez v0, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "LAYER_SCREE_ENTITIES= "; // const-string v1, "LAYER_SCREE_ENTITIES= "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.j;
/* const/16 v2, 0x8 */
v1 = (( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
v0 = (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* sub-int/2addr v0, v5 */
} // :goto_1
/* if-gez v0, :cond_1 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->t()V */
this.m = v3;
this.n = v3;
this.o = v3;
this.q = v3;
this.g = v3;
this.h = v3;
this.i = v3;
this.j = v3;
java.lang.System .gc ( );
try { // :try_start_0
v0 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).getTaskId ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->getTaskId()I
android.os.Process .killProcess ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_2
return;
} // :cond_0
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v4 ); // invoke-virtual {v1, v4}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
v1 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v6 ); // invoke-virtual {v1, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* add-int/lit8 v0, v0, -0x1 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->finish()V
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public void onLoadComplete ( ) {
/* .locals 2 */
return;
} // .end method
public org.anddev.andengine.engine.Engine onLoadEngine ( ) {
/* .locals 6 */
try { // :try_start_0
com.tgb.bg.jevcyxq.c.p .a ( );
/* new-instance v2, Landroid/util/DisplayMetrics; */
/* invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V */
/* move-object v0, p0 */
/* check-cast v0, Landroid/app/Activity; */
/* move-object v1, v0 */
(( android.app.Activity ) v1 ).getWindowManager ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
(( android.view.Display ) v1 ).getMetrics ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* new-instance v1, Lcom/tgb/bg/jevcyxq/refurbished/i; */
/* invoke-direct {v1}, Lcom/tgb/bg/jevcyxq/refurbished/i;-><init>()V */
this.i = v1;
/* new-instance v1, Lorg/anddev/andengine/engine/options/EngineOptions; */
int v2 = 1; // const/4 v2, 0x1
v3 = org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation.LANDSCAPE;
/* new-instance v4, Lorg/anddev/andengine/engine/options/resolutionpolicy/FillResolutionPolicy; */
/* invoke-direct {v4}, Lorg/anddev/andengine/engine/options/resolutionpolicy/FillResolutionPolicy;-><init>()V */
v5 = this.i;
/* invoke-direct {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/engine/options/EngineOptions;-><init>(ZLorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;Lorg/anddev/andengine/engine/options/resolutionpolicy/IResolutionPolicy;Lorg/anddev/andengine/engine/camera/Camera;)V */
int v2 = 1; // const/4 v2, 0x1
(( org.anddev.andengine.engine.options.EngineOptions ) v1 ).setNeedsMusic ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/engine/options/EngineOptions;->setNeedsMusic(Z)Lorg/anddev/andengine/engine/options/EngineOptions;
int v2 = 1; // const/4 v2, 0x1
(( org.anddev.andengine.engine.options.EngineOptions ) v1 ).setNeedsSound ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/engine/options/EngineOptions;->setNeedsSound(Z)Lorg/anddev/andengine/engine/options/EngineOptions;
/* new-instance v2, Lorg/anddev/andengine/engine/Engine; */
/* invoke-direct {v2, v1}, Lorg/anddev/andengine/engine/Engine;-><init>(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
this.h = v2;
v1 = this.h;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
/* new-instance v1, Lcom/tgb/bg/jevcyxq/views/s; */
/* invoke-direct {v1, p0}, Lcom/tgb/bg/jevcyxq/views/s;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).runOnUiThread ( v1 ); // invoke-virtual {p0, v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUiThread(Ljava/lang/Runnable;)V
int v1 = 0; // const/4 v1, 0x0
} // .end method
public void onLoadResources ( ) {
/* .locals 1 */
try { // :try_start_0
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).getEngine ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->getEngine()Lorg/anddev/andengine/engine/Engine;
this.h = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/ac; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/ac;-><init>(Landroid/content/Context;)V */
this.r = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/w; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/w;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.m = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/a; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/a;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.n = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/g; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/g;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.o = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/h; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/h;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.p = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/y; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/y;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.q = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/aa; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/aa;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.s = v0;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/c/z; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/c/z;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.t = v0;
v0 = this.m;
(( com.tgb.bg.jevcyxq.c.w ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/w;->a()V
v0 = this.n;
(( com.tgb.bg.jevcyxq.c.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/a;->a()V
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
/* new-instance v0, Lcom/tgb/bg/jevcyxq/views/u; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/views/u;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public org.anddev.andengine.entity.scene.Scene onLoadScene ( ) {
/* .locals 6 */
try { // :try_start_0
/* new-instance v0, Lcom/tgb/bg/jevcyxq/views/t; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/views/t;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
this.j = v0;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v1, 0x9 */
/* if-lt v0, v1, :cond_0 */
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->d()V
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->f()V
/* new-instance v0, Lorg/anddev/andengine/entity/text/ChangeableText; */
/* const v1, 0x44228000 # 650.0f */
/* const/high16 v2, 0x40400000 # 3.0f */
v3 = this.n;
v3 = this.a;
final String v4 = "Seconds elapsed:"; // const-string v4, "Seconds elapsed:"
final String v5 = "Seconds elapsed: XXXXX"; // const-string v5, "Seconds elapsed: XXXXX"
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/text/ChangeableText;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;I)V */
v1 = this.j;
int v2 = 4; // const/4 v2, 0x4
(( org.anddev.andengine.entity.scene.Scene ) v1 ).getChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
v1 = this.j;
/* new-instance v2, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* const v3, 0x3d4ccccd # 0.05f */
int v4 = 1; // const/4 v4, 0x1
/* new-instance v5, Lcom/tgb/bg/jevcyxq/views/v; */
/* invoke-direct {v5, p0, v0}, Lcom/tgb/bg/jevcyxq/views/v;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;Lorg/anddev/andengine/entity/text/ChangeableText;)V */
/* invoke-direct {v2, v3, v4, v5}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
(( org.anddev.andengine.entity.scene.Scene ) v1 ).registerUpdateHandler ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
try { // :try_start_1
v0 = this.s;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->b()V
/* :try_end_1 */
/* .catch Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
} // :goto_1
try { // :try_start_2
v0 = this.t;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/z;->c()V
/* :try_end_2 */
/* .catch Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
} // :goto_2
try { // :try_start_3
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->j()V
v0 = this.p;
(( com.tgb.bg.jevcyxq.c.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/h;->a()V
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->s()V
v0 = this.j;
} // :goto_3
} // :cond_0
v1 = this.j;
/* new-instance v2, Lorg/anddev/andengine/entity/Entity; */
/* invoke-direct {v2}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
(( org.anddev.andengine.entity.scene.Scene ) v1 ).attachChild ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/scene/Scene;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
/* add-int/lit8 v0, v0, 0x1 */
/* :catch_0 */
/* move-exception v0 */
(( org.anddev.andengine.entity.layer.tiled.tmx.util.exception.TMXLoadException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException;->printStackTrace()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v0, Lcom/tgb/bg/jevcyxq/views/w; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/views/w;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUiThread(Ljava/lang/Runnable;)V
int v0 = 0; // const/4 v0, 0x0
/* :catch_2 */
/* move-exception v0 */
try { // :try_start_4
(( org.anddev.andengine.entity.layer.tiled.tmx.util.exception.TMXLoadException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException;->printStackTrace()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
} // .end method
protected void onPause ( ) {
/* .locals 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->g()V
} // :cond_0
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onPause()V */
return;
} // .end method
public void onPauseGame ( ) {
/* .locals 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->g()V
} // :cond_0
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onPauseGame()V */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->h()V
} // :cond_0
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onResume()V */
return;
} // .end method
public void onResumeGame ( ) {
/* .locals 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->h()V
} // :cond_0
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onResumeGame()V */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "WINDOW FOCUS : "; // const-string v1, "WINDOW FOCUS : "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->s()V
} // :cond_0
/* invoke-super {p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->onWindowFocusChanged(Z)V */
return;
} // .end method
final void p ( ) {
/* .locals 1 */
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->a()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->d()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->c()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->e()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.p;
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.t;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/z;->e()V
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->t()V */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->k:Z */
try { // :try_start_0
v0 = this.t;
(( com.tgb.bg.jevcyxq.c.z ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/z;->c()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
} // :goto_0
v0 = this.o;
(( com.tgb.bg.jevcyxq.c.g ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/g;->k()V
v0 = this.q;
(( com.tgb.bg.jevcyxq.c.y ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/y;->h()V
v0 = this.p;
(( com.tgb.bg.jevcyxq.c.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/h;->a()V
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->f:F */
try { // :try_start_1
v0 = this.j;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).clearEntityModifiers ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/scene/Scene;->clearEntityModifiers()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :catch_1 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :catch_2 */
/* move-exception v0 */
} // .end method
final void q ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l:Z */
/* new-instance v0, Lcom/tgb/bg/jevcyxq/views/f; */
/* invoke-direct {v0, p0}, Lcom/tgb/bg/jevcyxq/views/f;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUiThread(Ljava/lang/Runnable;)V
return;
} // .end method
public final void r ( ) {
/* .locals 4 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->d:I */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e:I */
com.tgb.bg.jevcyxq.a.a .a ( v1,v2 );
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v1 ).setCancelable ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v2 = "New Levels are here!"; // const-string v2, "New Levels are here!"
(( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v2 = "Cool! Lets GO!"; // const-string v2, "Cool! Lets GO!"
/* new-instance v3, Lcom/tgb/bg/jevcyxq/views/g; */
/* invoke-direct {v3, p0}, Lcom/tgb/bg/jevcyxq/views/g;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;)V */
(( android.app.AlertDialog$Builder ) v1 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* const v1, 0x7f02000d */
(( android.app.AlertDialog ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setIcon(I)V
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
return;
} // .end method
public final void s ( ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v4, 0x40000000 # 2.0f */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.tgb.bg.jevcyxq.d.a .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.r;
final String v1 = "SOLUTION_POINTS_GIVEN"; // const-string v1, "SOLUTION_POINTS_GIVEN"
v0 = (( com.tgb.bg.jevcyxq.c.ac ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->d(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
v0 = this.r;
/* const/16 v1, 0xa */
(( com.tgb.bg.jevcyxq.c.ac ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->a(I)V
v0 = this.r;
final String v1 = "SOLUTION_POINTS_GIVEN"; // const-string v1, "SOLUTION_POINTS_GIVEN"
(( com.tgb.bg.jevcyxq.c.ac ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->e(Ljava/lang/String;)V
} // :cond_0
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.o;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.o;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.r;
v0 = (( com.tgb.bg.jevcyxq.c.ac ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/ac;->a()I
/* if-lez v0, :cond_2 */
v0 = this.o;
v0 = this.b;
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = this.r;
v2 = (( com.tgb.bg.jevcyxq.c.ac ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/c/ac;->a()I
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.anddev.andengine.entity.text.ChangeableText ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/text/ChangeableText;->setText(Ljava/lang/String;)V
v0 = this.o;
v0 = this.b;
(( org.anddev.andengine.entity.text.ChangeableText ) v0 ).setVisible ( v5 ); // invoke-virtual {v0, v5}, Lorg/anddev/andengine/entity/text/ChangeableText;->setVisible(Z)V
v0 = this.o;
v0 = this.b;
/* const/high16 v1, 0x3f800000 # 1.0f */
(( org.anddev.andengine.entity.text.ChangeableText ) v0 ).setColor ( v1, v3, v3 ); // invoke-virtual {v0, v1, v3, v3}, Lorg/anddev/andengine/entity/text/ChangeableText;->setColor(FFF)V
v0 = this.o;
v0 = this.b;
v1 = this.o;
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.refurbished.k ) v1 ).getX ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getX()F
v2 = this.o;
v2 = this.a;
v2 = (( com.tgb.bg.jevcyxq.refurbished.k ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getWidth()F
/* div-float/2addr v2, v4 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
v2 = this.o;
v2 = this.b;
v2 = (( org.anddev.andengine.entity.text.ChangeableText ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/entity/text/ChangeableText;->getWidth()F
/* div-float/2addr v2, v4 */
/* sub-float/2addr v1, v2 */
v2 = this.o;
v2 = this.a;
v2 = (( com.tgb.bg.jevcyxq.refurbished.k ) v2 ).getY ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getY()F
v3 = this.o;
v3 = this.a;
v3 = (( com.tgb.bg.jevcyxq.refurbished.k ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getHeight()F
/* div-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* const/high16 v3, 0x40400000 # 3.0f */
/* sub-float/2addr v2, v3 */
v3 = this.o;
v3 = this.b;
v3 = (( org.anddev.andengine.entity.text.ChangeableText ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/entity/text/ChangeableText;->getHeight()F
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
(( org.anddev.andengine.entity.text.ChangeableText ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/text/ChangeableText;->setPosition(FF)V
v0 = this.o;
v0 = this.a;
(( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setVisible ( v5 ); // invoke-virtual {v0, v5}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setVisible(Z)V
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.o;
v0 = this.b;
(( org.anddev.andengine.entity.text.ChangeableText ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/entity/text/ChangeableText;->setVisible(Z)V
v0 = this.o;
v0 = this.a;
(( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setVisible ( v2 ); // invoke-virtual {v0, v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setVisible(Z)V
} // .end method
