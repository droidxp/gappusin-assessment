public class lqh.china.lianliankancgrbw.LayerMain extends lqh.china.lianliankancgrbw.PubLayer implements com.wiyun.engine.nodes.INodeVirtualMethods {
	 /* # interfaces */
	 /* # instance fields */
	 at g;
	 private com.wiyun.engine.types.WYRect rButtonAbout;
	 private com.wiyun.engine.types.WYRect rButtonLevel1;
	 private com.wiyun.engine.types.WYRect rButtonLevel2;
	 private com.wiyun.engine.types.WYRect rButtonLevel3;
	 private com.wiyun.engine.types.WYRect rButtonMusic;
	 private com.wiyun.engine.types.WYRect rButtonScore;
	 private com.wiyun.engine.types.WYRect rButtonSound;
	 private com.wiyun.engine.types.WYRect rLogo;
	 private com.wiyun.engine.nodes.Sprite sButtonAbout;
	 private com.wiyun.engine.nodes.Sprite sButtonLevel1;
	 private com.wiyun.engine.nodes.Sprite sButtonLevel2;
	 private com.wiyun.engine.nodes.Sprite sButtonLevel3;
	 private com.wiyun.engine.nodes.Sprite sButtonMusic;
	 private com.wiyun.engine.nodes.Sprite sButtonScore;
	 private com.wiyun.engine.nodes.Sprite sButtonSound;
	 private com.wiyun.engine.nodes.Sprite sLogo;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.LayerMain ( ) {
		 /* .locals 9 */
		 int v8 = 2; // const/4 v8, 0x2
		 int v7 = 0; // const/4 v7, 0x0
		 int v6 = 1; // const/4 v6, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/PubLayer;-><init>()V */
		 this.g = p1;
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
		 /* const v1, 0x7f020001 */
		 com.wiyun.engine.nodes.Sprite .make ( v1 );
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAnchor ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setAnchor(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setPosition ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setContentSize ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAutoFit ( v6 ); // invoke-virtual {v1, v6}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).addChild ( v1, v7 ); // invoke-virtual {p0, v1, v7}, Llqh/china/lianliankancgrbw/LayerMain;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
		 /* const v1, 0x7f02005b */
		 com.wiyun.engine.nodes.Sprite .make ( v1 );
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAnchor ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setAnchor(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setPosition ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setContentSize ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAutoFit ( v6 ); // invoke-virtual {v1, v6}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).addChild ( v1, v7 ); // invoke-virtual {p0, v1, v7}, Llqh/china/lianliankancgrbw/LayerMain;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 v0 = this.particle_manager;
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 (( lqh.china.lianliankancgrbw.PubParticleManager ) v0 ).of_play_particle_fireup ( v1 ); // invoke-virtual {v0, v1}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_fireup(F)V
		 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
		 v1 = this.particle_manager;
		 final String v2 = "of_play_particle_fireup(float,float)"; // const-string v2, "of_play_particle_fireup(float,float)"
		 /* new-array v3, v8, [Ljava/lang/Object; */
		 java.lang.Float .valueOf ( v5 );
		 /* aput-object v4, v3, v7 */
		 /* const v4, 0x3f4ccccd # 0.8f */
		 java.lang.Float .valueOf ( v4 );
		 /* aput-object v4, v3, v6 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
		 /* const/high16 v1, 0x40400000 # 3.0f */
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
		 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
		 v1 = this.particle_manager;
		 final String v2 = "of_play_particle_fireup(float,float)"; // const-string v2, "of_play_particle_fireup(float,float)"
		 /* new-array v3, v8, [Ljava/lang/Object; */
		 java.lang.Float .valueOf ( v5 );
		 /* aput-object v4, v3, v7 */
		 /* const v4, 0x3f8ccccd # 1.1f */
		 java.lang.Float .valueOf ( v4 );
		 /* aput-object v4, v3, v6 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
		 /* const/high16 v1, 0x40c00000 # 6.0f */
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
		 v0 = this.particle_manager;
		 /* const v1, 0x3f99999a # 1.2f */
		 (( lqh.china.lianliankancgrbw.PubParticleManager ) v0 ).of_play_particle_fireup ( v1 ); // invoke-virtual {v0, v1}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_fireup(F)V
		 v0 = this.particle_manager;
		 int v1 = 6; // const/4 v1, 0x6
		 (( lqh.china.lianliankancgrbw.PubParticleManager ) v0 ).of_play_particle_starlight ( v1 ); // invoke-virtual {v0, v1}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_starlight(I)V
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/LayerMain;->of_init_face()V */
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).setTouchEnabled ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerMain;->setTouchEnabled(Z)V
		 /* sget-boolean v0, Lay;->m:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.g;
			 v0 = this.a;
			 /* const v1, 0x7f04000b */
			 ay .a ( v0,v1 );
		 } // :cond_0
		 (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).setJavaVirtualMethods ( p0 ); // invoke-virtual {p0, p0}, Llqh/china/lianliankancgrbw/LayerMain;->setJavaVirtualMethods(Lcom/wiyun/engine/nodes/INodeVirtualMethods;)V
		 return;
	 } // .end method
	 private Integer of_cal_rowcount ( Integer p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-gtz p1, :cond_1 */
	 } // :cond_0
} // :goto_0
} // :cond_1
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getWindowSize ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
/* iget v2, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const/high16 v3, 0x43f00000 # 480.0f */
/* div-float/2addr v2, v3 */
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* const/high16 v3, 0x433c0000 # 188.0f */
/* mul-float/2addr v3, v2 */
/* sub-float/2addr v1, v3 */
/* const/high16 v3, 0x43e00000 # 448.0f */
/* mul-float/2addr v2, v3 */
/* int-to-float v3, p1 */
/* div-float/2addr v2, v3 */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* cmpg-float v3, v2, v3 */
/* if-ltz v3, :cond_0 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* if-lez v1, :cond_0 */
/* move v0, v1 */
} // .end method
private void of_init_face ( ) {
/* .locals 9 */
/* const/high16 v8, 0x43f00000 # 480.0f */
/* const/high16 v7, 0x40000000 # 2.0f */
/* const v6, 0x3f8ccccd # 1.1f */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
v0 = this.g;
/* iget v0, v0, Lat;->q:I */
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
ax .a ( v0 );
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const v2, 0x43da8000 # 437.0f */
/* mul-float/2addr v0, v2 */
/* div-float v2, v0, v8 */
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const/high16 v3, 0x43020000 # 130.0f */
/* mul-float/2addr v0, v3 */
/* div-float/2addr v0, v8 */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* sub-float/2addr v3, v2 */
/* div-float/2addr v3, v7 */
/* iget v4, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* iget v5, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* sub-float/2addr v4, v5 */
/* sub-float/2addr v4, v0 */
/* div-float/2addr v4, v7 */
int v5 = 0; // const/4 v5, 0x0
/* cmpg-float v5, v4, v5 */
/* if-gez v5, :cond_0 */
/* mul-float v5, v4, v7 */
/* add-float/2addr v0, v5 */
} // :cond_0
/* iget v5, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* sub-float v4, v5, v4 */
/* sub-float/2addr v4, v0 */
com.wiyun.engine.types.WYRect .make ( v3,v4,v2,v0 );
this.rLogo = v0;
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const v2, 0x3dcccccd # 0.1f */
/* mul-float/2addr v0, v2 */
/* const v2, 0x3e4ccccd # 0.2f */
/* mul-float/2addr v2, v0 */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* mul-float v4, v0, v6 */
/* sub-float/2addr v3, v4 */
com.wiyun.engine.types.WYRect .make ( v2,v3,v0,v0 );
this.rButtonMusic = v2;
/* const v2, 0x3fb33333 # 1.4f */
/* mul-float/2addr v2, v0 */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* mul-float v4, v0, v6 */
/* sub-float/2addr v3, v4 */
com.wiyun.engine.types.WYRect .make ( v2,v3,v0,v0 );
this.rButtonSound = v2;
/* const v2, 0x40266666 # 2.6f */
/* mul-float/2addr v2, v0 */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* mul-float v4, v0, v6 */
/* sub-float/2addr v3, v4 */
com.wiyun.engine.types.WYRect .make ( v2,v3,v0,v0 );
this.rButtonScore = v2;
/* iget v2, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* const v3, 0x3f99999a # 1.2f */
/* mul-float/2addr v3, v0 */
/* sub-float/2addr v2, v3 */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* mul-float v4, v0, v6 */
/* sub-float/2addr v3, v4 */
com.wiyun.engine.types.WYRect .make ( v2,v3,v0,v0 );
this.rButtonAbout = v0;
v0 = this.rButtonMusic;
/* const v2, 0x7f02000b */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonMusic = v0;
v0 = this.rButtonSound;
/* const v2, 0x7f02000e */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonSound = v0;
v0 = this.rButtonAbout;
/* const v2, 0x7f020006 */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonAbout = v0;
v0 = this.rButtonScore;
/* const v2, 0x7f02000d */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonScore = v0;
v0 = this.rLogo;
/* const v2, 0x7f02004f */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sLogo = v0;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->of_set_button_pic_by_status()V
/* iget v0, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* div-float/2addr v0, v8 */
/* const/high16 v1, 0x43740000 # 244.0f */
/* mul-float/2addr v1, v0 */
/* const/high16 v2, 0x42c00000 # 96.0f */
/* mul-float/2addr v2, v0 */
/* const/high16 v3, 0x43470000 # 199.0f */
/* mul-float/2addr v3, v0 */
/* const/high16 v4, 0x439a0000 # 308.0f */
/* mul-float/2addr v4, v0 */
com.wiyun.engine.types.WYRect .make ( v3,v4,v1,v2 );
this.rButtonLevel1 = v3;
/* const/high16 v3, 0x434f0000 # 207.0f */
/* mul-float/2addr v3, v0 */
/* const/high16 v4, 0x43500000 # 208.0f */
/* mul-float/2addr v4, v0 */
com.wiyun.engine.types.WYRect .make ( v3,v4,v1,v2 );
this.rButtonLevel2 = v3;
/* const/high16 v3, 0x435b0000 # 219.0f */
/* mul-float/2addr v3, v0 */
/* const/high16 v4, 0x42da0000 # 109.0f */
/* mul-float/2addr v0, v4 */
com.wiyun.engine.types.WYRect .make ( v3,v0,v1,v2 );
this.rButtonLevel3 = v0;
v0 = this.rButtonLevel1;
/* const v1, 0x7f020008 */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonLevel1 = v0;
v0 = this.rButtonLevel2;
/* const v1, 0x7f020009 */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonLevel2 = v0;
v0 = this.rButtonLevel3;
/* const v1, 0x7f02000a */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_create_label_sprite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;I)Lcom/wiyun/engine/nodes/Sprite;
this.sButtonLevel3 = v0;
v0 = this.sButtonScore;
int v1 = 0; // const/4 v1, 0x0
(( com.wiyun.engine.nodes.Sprite ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setVisible(Z)V
return;
} // .end method
/* # virtual methods */
public void jDraw ( ) {
/* .locals 0 */
return;
} // .end method
public void jOnEnter ( ) {
/* .locals 2 */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->of_set_button_pic_by_status()V
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
v0 = this.a;
/* const v1, 0x7f04000b */
ay .a ( v0,v1 );
} // :cond_0
return;
} // .end method
public void jOnEnterTransitionDidFinish ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.g;
/* iget-boolean v0, v0, Lat;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
/* iput-boolean v4, v0, Lat;->l:Z */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_sumbmit_score(float)"; // const-string v1, "of_sumbmit_score(float)"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Float .valueOf ( v3 );
/* aput-object v3, v2, v4 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* const v1, 0x3dcccccd # 0.1f */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :cond_0
com.wiyun.engine.nodes.Director .getInstance ( );
v0 = (( com.wiyun.engine.nodes.Director ) v0 ).isUIPaused ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->isUIPaused()Z
if ( v0 != null) { // if-eqz v0, :cond_1
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).resumeUI ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->resumeUI()V
final String v0 = "RESUME-UI"; // const-string v0, "RESUME-UI"
final String v1 = "wyTouchesBegan"; // const-string v1, "wyTouchesBegan"
android.util.Log .d ( v0,v1 );
} // :cond_1
return;
} // .end method
public void jOnExit ( ) {
/* .locals 0 */
return;
} // .end method
public void of_AlertDialog ( Float p0 ) {
/* .locals 11 */
int v2 = 2; // const/4 v2, 0x2
/* const/high16 v6, 0x3f800000 # 1.0f */
int v10 = 1; // const/4 v10, 0x1
/* const/high16 v9, 0x41a00000 # 20.0f */
int v4 = 0; // const/4 v4, 0x0
/* const v0, 0x7f04000a */
com.wiyun.engine.utils.BitmapFont .loadFont ( v0,v2 );
final String v1 = "About"; // const-string v1, "About"
com.wiyun.engine.nodes.BitmapFontLabel .make ( v0,v1 );
/* const v1, 0x7f04000a */
com.wiyun.engine.utils.BitmapFont .loadFont ( v1,v2 );
final String v2 = "Version 1.0\nAuthor FlyDream\nDate 2012.11"; // const-string v2, "Version 1.0\nAuthor FlyDream\nDate 2012.11"
com.wiyun.engine.nodes.BitmapFontLabel .make ( v1,v2 );
/* new-instance v2, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v2, v4, v4, v4}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.BitmapFontLabel ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.BitmapFontLabel ) v1 ).setAlignment ( v4 ); // invoke-virtual {v1, v4}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->setAlignment(I)V
/* const v2, 0x3f19999a # 0.6f */
(( com.wiyun.engine.nodes.BitmapFontLabel ) v1 ).setScale ( v2 ); // invoke-virtual {v1, v2}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->setScale(F)V
(( com.wiyun.engine.nodes.BitmapFontLabel ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.BitmapFontLabel ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/BitmapFontLabel;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* const v3, 0x7f050001 */
(( android.content.Context ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "\n\nVersion:"; // const-string v3, "\n\nVersion:"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ao .a ( v1 );
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\nAuthor:FlyDream 2013.04"; // const-string v2, "\nAuthor:FlyDream 2013.04"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/high16 v2, 0x41400000 # 12.0f */
com.wiyun.engine.nodes.Label .make ( v1,v2,v10 );
/* new-instance v2, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v2, v4, v4, v4}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
/* const v2, 0x7f020010 */
com.wiyun.engine.opengl.Texture2D .make ( v2 );
/* const/high16 v3, 0x43020000 # 130.0f */
v3 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v3 ); // invoke-virtual {p0, v3}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
v4 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
v5 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
v6 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v6 ); // invoke-virtual {p0, v6}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
com.wiyun.engine.types.WYRect .make ( v3,v4,v5,v6 );
com.wiyun.engine.nodes.NinePatchSprite .make ( v2,v3 );
(( com.wiyun.engine.nodes.NinePatchSprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/NinePatchSprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* const v3, 0x7f020011 */
com.wiyun.engine.opengl.Texture2D .make ( v3 );
com.wiyun.engine.nodes.Sprite .make ( v3 );
final String v4 = "OK"; // const-string v4, "OK"
com.wiyun.engine.nodes.Label .make ( v4,v9 );
/* new-instance v5, Lcom/wiyun/engine/types/WYColor3B; */
/* const/16 v6, 0x60 */
/* const/16 v7, 0x38 */
/* const/16 v8, 0x13 */
/* invoke-direct {v5, v6, v7, v8}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
(( com.wiyun.engine.nodes.Label ) v4 ).setColor ( v5 ); // invoke-virtual {v4, v5}, Lcom/wiyun/engine/nodes/Label;->setColor(Lcom/wiyun/engine/types/WYColor3B;)V
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
(( com.wiyun.engine.nodes.Label ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
com.wiyun.engine.dialog.Dialog .make ( );
(( com.wiyun.engine.dialog.Dialog ) v5 ).a ( v2 ); // invoke-virtual {v5, v2}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
v6 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
v7 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
v8 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
/* const/high16 v9, 0x41700000 # 15.0f */
v9 = (( lqh.china.lianliankancgrbw.LayerMain ) p0 ).DP ( v9 ); // invoke-virtual {p0, v9}, Llqh/china/lianliankancgrbw/LayerMain;->DP(F)F
(( com.wiyun.engine.dialog.Dialog ) v2 ).a ( v6, v7, v8, v9 ); // invoke-virtual {v2, v6, v7, v8, v9}, Lcom/wiyun/engine/dialog/Dialog;->a(FFFF)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/wiyun/engine/dialog/Dialog;->b(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->c(Lcom/wiyun/engine/nodes/Node;)Lcom/wiyun/engine/dialog/Dialog;
int v1 = 0; // const/4 v1, 0x0
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v3, v4, v1 ); // invoke-virtual {v0, v3, v4, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)Lcom/wiyun/engine/dialog/Dialog;
com.wiyun.engine.dialog.DialogPopupTransition .make ( );
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/dialog/Dialog;->a(Lcom/wiyun/engine/dialog/DialogTransition;)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v10 ); // invoke-virtual {v0, v10}, Lcom/wiyun/engine/dialog/Dialog;->a(I)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v0 ).a ( v10 ); // invoke-virtual {v0, v10}, Lcom/wiyun/engine/dialog/Dialog;->a(Z)Lcom/wiyun/engine/dialog/Dialog;
(( com.wiyun.engine.dialog.Dialog ) v5 ).autoRelease ( ); // invoke-virtual {v5}, Lcom/wiyun/engine/dialog/Dialog;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
return;
} // .end method
public void of_begin ( Integer p0 ) {
/* .locals 6 */
int v5 = 3; // const/4 v5, 0x3
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
v0 = this.g;
/* iput p1, v0, Lat;->e:I */
v0 = this.g;
/* iput v3, v0, Lat;->d:I */
v0 = this.g;
/* iget v0, v0, Lat;->e:I */
/* if-ne v0, v4, :cond_0 */
v0 = this.g;
/* const/16 v1, 0x1e */
/* iput v1, v0, Lat;->r:I */
v0 = this.g;
int v1 = 6; // const/4 v1, 0x6
/* iput v1, v0, Lat;->q:I */
v0 = this.g;
v1 = this.g;
/* iget v1, v1, Lat;->q:I */
v1 = /* invoke-direct {p0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_cal_rowcount(I)I */
/* iput v1, v0, Lat;->p:I */
} // :cond_0
v0 = this.g;
/* iget v0, v0, Lat;->e:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
v0 = this.g;
/* const/16 v1, 0x28 */
/* iput v1, v0, Lat;->r:I */
v0 = this.g;
int v1 = 7; // const/4 v1, 0x7
/* iput v1, v0, Lat;->q:I */
v0 = this.g;
v1 = this.g;
/* iget v1, v1, Lat;->q:I */
v1 = /* invoke-direct {p0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_cal_rowcount(I)I */
/* iput v1, v0, Lat;->p:I */
} // :cond_1
v0 = this.g;
/* iget v0, v0, Lat;->e:I */
/* if-ne v0, v5, :cond_2 */
v0 = this.g;
/* const/16 v1, 0x3c */
/* iput v1, v0, Lat;->r:I */
v0 = this.g;
/* const/16 v1, 0x8 */
/* iput v1, v0, Lat;->q:I */
v0 = this.g;
v1 = this.g;
/* iget v1, v1, Lat;->q:I */
v1 = /* invoke-direct {p0, v1}, Llqh/china/lianliankancgrbw/LayerMain;->of_cal_rowcount(I)I */
/* iput v1, v0, Lat;->p:I */
} // :cond_2
com.wiyun.engine.nodes.Scene .make ( );
/* new-instance v1, Llqh/china/lianliankancgrbw/LayerGame; */
v2 = this.g;
/* invoke-direct {v1, v2}, Llqh/china/lianliankancgrbw/LayerGame;-><init>(Lat;)V */
(( com.wiyun.engine.nodes.Scene ) v0 ).addChild ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lcom/wiyun/engine/nodes/Scene;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
(( com.wiyun.engine.nodes.Scene ) v0 ).autoRelease ( v4 ); // invoke-virtual {v0, v4}, Lcom/wiyun/engine/nodes/Scene;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
/* const/high16 v1, 0x3f800000 # 1.0f */
com.wiyun.engine.transitions.ClipInTransition .make ( v1,v0,v5 );
(( com.wiyun.engine.transitions.ClipInTransition ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/transitions/ClipInTransition;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/transitions/TransitionScene; */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).pushScene ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Director;->pushScene(Lcom/wiyun/engine/nodes/Scene;)V
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
ax .a ( v0 );
return;
} // .end method
public void of_begin1 ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_begin ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_begin(I)V
return;
} // .end method
public void of_begin2 ( Float p0 ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_begin ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_begin(I)V
return;
} // .end method
public void of_begin3 ( Float p0 ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_begin ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_begin(I)V
return;
} // .end method
public void of_button_down_imitate ( com.wiyun.engine.nodes.Sprite p0 ) {
/* .locals 4 */
/* const v0, 0x3dcccccd # 0.1f */
/* const v1, 0x3f99999a # 1.2f */
com.wiyun.engine.actions.ScaleBy .make ( v0,v1 );
(( com.wiyun.engine.actions.ScaleBy ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/ScaleBy;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.actions.IntervalAction ) v0 ).reverse ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/IntervalAction;->reverse()Lcom/wiyun/engine/actions/IntervalAction;
(( com.wiyun.engine.actions.IntervalAction ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/actions/IntervalAction;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/actions/IntervalAction; */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Lcom/wiyun/engine/actions/FiniteTimeAction; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v1, v2, v3 */
com.wiyun.engine.actions.Sequence .make ( v0,v2 );
(( com.wiyun.engine.actions.Sequence ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/actions/Sequence;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/actions/IntervalAction; */
(( com.wiyun.engine.nodes.Sprite ) p1 ).runAction ( v0 ); // invoke-virtual {p1, v0}, Lcom/wiyun/engine/nodes/Sprite;->runAction(Lcom/wiyun/engine/actions/Action;)V
ay .a ( v0 );
return;
} // .end method
public void of_challenge ( ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_begin ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_begin(I)V
return;
} // .end method
public void of_exit ( ) {
/* .locals 1 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).popScene ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->popScene()V
return;
} // .end method
public void of_set_button_pic_by_status ( ) {
/* .locals 2 */
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const v0, 0x7f02000b */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :goto_0
v1 = this.sButtonMusic;
(( com.wiyun.engine.nodes.Sprite ) v1 ).setTexture ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
v0 = ay .b ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* const v0, 0x7f02000e */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :goto_1
v1 = this.sButtonSound;
(( com.wiyun.engine.nodes.Sprite ) v1 ).setTexture ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
return;
} // :cond_0
/* const v0, 0x7f02000c */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // :cond_1
/* const v0, 0x7f02000f */
com.wiyun.engine.opengl.Texture2D .make ( v0 );
} // .end method
public void of_sumbmit_score ( Float p0 ) {
/* .locals 2 */
v0 = this.g;
/* iget v0, v0, Lat;->e:I */
v1 = this.g;
/* iget v1, v1, Lat;->k:I */
ax .a ( v0 );
return;
} // .end method
public void onButtonAboutClicked ( ) {
/* .locals 1 */
v0 = this.sButtonAbout;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
int v0 = 0; // const/4 v0, 0x0
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_AlertDialog ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_AlertDialog(F)V
return;
} // .end method
public void onButtonMusicClicked ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.sButtonMusic;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
/* sget-boolean v0, Lay;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
ay.m = (v2!= 0);
v0 = this.g;
v0 = this.a;
final String v1 = "ibmusic"; // const-string v1, "ibmusic"
ax .a ( v0,v1,v2 );
ay .a ( );
} // :goto_0
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->of_set_button_pic_by_status()V
return;
} // :cond_0
ay.m = (v3!= 0);
v0 = this.g;
v0 = this.a;
final String v1 = "ibmusic"; // const-string v1, "ibmusic"
ax .a ( v0,v1,v3 );
v0 = this.g;
v0 = this.a;
/* const v1, 0x7f04000b */
ay .a ( v0,v1 );
} // .end method
public void onButtonScoreClicked ( ) {
/* .locals 0 */
return;
} // .end method
public void onButtonSoundClicked ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.sButtonSound;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v0 ); // invoke-virtual {p0, v0}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
v0 = ay .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
ay .a ( v2 );
v0 = this.g;
v0 = this.a;
final String v1 = "ibsound"; // const-string v1, "ibsound"
ax .a ( v0,v1,v2 );
} // :goto_0
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_set_button_pic_by_status ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->of_set_button_pic_by_status()V
return;
} // :cond_0
ay .a ( v3 );
v0 = this.g;
v0 = this.a;
final String v1 = "ibsound"; // const-string v1, "ibsound"
ax .a ( v0,v1,v3 );
} // .end method
public Boolean wyTouchesBegan ( android.view.MotionEvent p0 ) {
/* .locals 9 */
/* const v8, 0x3dcccccd # 0.1f */
int v7 = 0; // const/4 v7, 0x0
int v1 = 0; // const/4 v1, 0x0
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.nodes.Director .getInstance ( );
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.wiyun.engine.nodes.Director ) v2 ).convertToGL ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/wiyun/engine/nodes/Director;->convertToGL(FF)Lcom/wiyun/engine/types/WYPoint;
v3 = this.rButtonMusic;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).onButtonMusicClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->onButtonMusicClicked()V
} // :goto_0
} // :cond_0
v3 = this.rButtonSound;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).onButtonSoundClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->onButtonSoundClicked()V
} // :cond_1
v3 = this.rButtonAbout;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).onButtonAboutClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->onButtonAboutClicked()V
} // :cond_2
v3 = this.rButtonScore;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).onButtonScoreClicked ( ); // invoke-virtual {p0}, Llqh/china/lianliankancgrbw/LayerMain;->onButtonScoreClicked()V
} // :cond_3
v3 = this.rButtonLevel1;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
v3 = this.sButtonLevel1;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v3 ); // invoke-virtual {p0, v3}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
/* new-instance v3, Lcom/wiyun/engine/utils/TargetSelector; */
final String v4 = "of_begin1(float)"; // const-string v4, "of_begin1(float)"
/* new-array v5, v0, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v7 );
/* aput-object v6, v5, v1 */
/* invoke-direct {v3, p0, v4, v5}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v3, v8 ); // invoke-virtual {p0, v3, v8}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :cond_4
v3 = this.rButtonLevel2;
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
v3 = this.sButtonLevel2;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v3 ); // invoke-virtual {p0, v3}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
/* new-instance v3, Lcom/wiyun/engine/utils/TargetSelector; */
final String v4 = "of_begin2(float)"; // const-string v4, "of_begin2(float)"
/* new-array v5, v0, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v7 );
/* aput-object v6, v5, v1 */
/* invoke-direct {v3, p0, v4, v5}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v3, v8 ); // invoke-virtual {p0, v3, v8}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :cond_5
v3 = this.rButtonLevel3;
v2 = (( com.wiyun.engine.types.WYRect ) v3 ).containsPoint ( v2 ); // invoke-virtual {v3, v2}, Lcom/wiyun/engine/types/WYRect;->containsPoint(Lcom/wiyun/engine/types/WYPoint;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
v2 = this.sButtonLevel3;
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).of_button_down_imitate ( v2 ); // invoke-virtual {p0, v2}, Llqh/china/lianliankancgrbw/LayerMain;->of_button_down_imitate(Lcom/wiyun/engine/nodes/Sprite;)V
/* new-instance v2, Lcom/wiyun/engine/utils/TargetSelector; */
final String v3 = "of_begin3(float)"; // const-string v3, "of_begin3(float)"
/* new-array v0, v0, [Ljava/lang/Object; */
java.lang.Float .valueOf ( v7 );
/* aput-object v4, v0, v1 */
/* invoke-direct {v2, p0, v3, v0}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.LayerMain ) p0 ).scheduleOnce ( v2, v8 ); // invoke-virtual {p0, v2, v8}, Llqh/china/lianliankancgrbw/LayerMain;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
} // :cond_6
/* move v0, v1 */
/* goto/16 :goto_0 */
} // .end method
