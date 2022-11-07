public class lqh.china.lianliankancgrbw.PubParticleManager {
	 /* # instance fields */
	 java.util.ArrayList array_wp;
	 public com.wiyun.engine.nodes.Layer layer_parent;
	 public Integer zOrder;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.PubParticleManager ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* iput v0, p0, Llqh/china/lianliankancgrbw/PubParticleManager;->zOrder:I */
		 this.layer_parent = p1;
		 /* iput p2, p0, Llqh/china/lianliankancgrbw/PubParticleManager;->zOrder:I */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.array_wp = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void of_play_particle_fireup ( Float p0 ) {
		 /* .locals 13 */
		 /* const v12, 0x3f4ccccd # 0.8f */
		 /* const v8, 0x3e4ccccd # 0.2f */
		 int v7 = 0; // const/4 v7, 0x0
		 int v11 = 4; // const/4 v11, 0x4
		 int v1 = 0; // const/4 v1, 0x0
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
		 /* new-array v2, v11, [Lcom/wiyun/engine/types/WYPoint; */
		 /* iget v3, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 java.lang.Math .random ( );
		 /* move-result-wide v4 */
		 /* double-to-float v4, v4 */
		 /* mul-float/2addr v4, v8 */
		 /* const v5, 0x3dcccccd # 0.1f */
		 /* add-float/2addr v4, v5 */
		 /* mul-float/2addr v3, v4 */
		 com.wiyun.engine.types.WYPoint .make ( v3,v7 );
		 /* aput-object v3, v2, v1 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 java.lang.Math .random ( );
		 /* move-result-wide v5 */
		 /* double-to-float v5, v5 */
		 /* mul-float/2addr v5, v8 */
		 /* const v6, 0x3e99999a # 0.3f */
		 /* add-float/2addr v5, v6 */
		 /* mul-float/2addr v4, v5 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v7 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 java.lang.Math .random ( );
		 /* move-result-wide v5 */
		 /* double-to-float v5, v5 */
		 /* mul-float/2addr v5, v8 */
		 /* const/high16 v6, 0x3f000000 # 0.5f */
		 /* add-float/2addr v5, v6 */
		 /* mul-float/2addr v4, v5 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v7 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 3; // const/4 v3, 0x3
		 /* iget v4, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 java.lang.Math .random ( );
		 /* move-result-wide v5 */
		 /* double-to-float v5, v5 */
		 /* mul-float/2addr v5, v8 */
		 /* const v6, 0x3f333333 # 0.7f */
		 /* add-float/2addr v5, v6 */
		 /* mul-float/2addr v4, v5 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v7 );
		 /* aput-object v4, v2, v3 */
		 /* new-array v3, v11, [Lcom/wiyun/engine/types/WYPoint; */
		 /* aget-object v4, v2, v1 */
		 /* iget v4, v4, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v5, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* const v6, 0x3f333333 # 0.7f */
		 /* mul-float/2addr v5, v6 */
		 /* mul-float/2addr v5, p1 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v5 );
		 /* aput-object v4, v3, v1 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget-object v5, v2, v5 */
		 /* iget v5, v5, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v6, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* mul-float/2addr v6, v12 */
		 /* mul-float/2addr v6, p1 */
		 com.wiyun.engine.types.WYPoint .make ( v5,v6 );
		 /* aput-object v5, v3, v4 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v5 = 2; // const/4 v5, 0x2
		 /* aget-object v5, v2, v5 */
		 /* iget v5, v5, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v6, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* mul-float/2addr v6, v12 */
		 /* mul-float/2addr v6, p1 */
		 com.wiyun.engine.types.WYPoint .make ( v5,v6 );
		 /* aput-object v5, v3, v4 */
		 int v4 = 3; // const/4 v4, 0x3
		 int v5 = 3; // const/4 v5, 0x3
		 /* aget-object v5, v2, v5 */
		 /* iget v5, v5, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* const v6, 0x3f333333 # 0.7f */
		 /* mul-float/2addr v0, v6 */
		 /* mul-float/2addr v0, p1 */
		 com.wiyun.engine.types.WYPoint .make ( v5,v0 );
		 /* aput-object v0, v3, v4 */
		 v0 = this.array_wp;
		 (( java.util.ArrayList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 v0 = this.array_wp;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* add-int/lit8 v4, v0, -0x1 */
		 /* new-array v5, v11, [Lcom/wiyun/engine/particle/ParticleSystem; */
		 /* new-array v6, v11, [Lcom/wiyun/engine/actions/MoveTo; */
		 /* move v0, v1 */
	 } // :goto_0
	 /* if-lt v0, v11, :cond_0 */
	 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
	 final String v2 = "of_play_particle_firework(float,float,int)"; // const-string v2, "of_play_particle_firework(float,float,int)"
	 int v3 = 3; // const/4 v3, 0x3
	 /* new-array v3, v3, [Ljava/lang/Object; */
	 /* const/high16 v5, 0x40400000 # 3.0f */
	 java.lang.Float .valueOf ( v5 );
	 /* aput-object v5, v3, v1 */
	 int v1 = 1; // const/4 v1, 0x1
	 java.lang.Float .valueOf ( p1 );
	 /* aput-object v5, v3, v1 */
	 int v1 = 2; // const/4 v1, 0x2
	 java.lang.Integer .valueOf ( v4 );
	 /* aput-object v4, v3, v1 */
	 /* invoke-direct {v0, p0, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
	 v1 = this.layer_parent;
	 (( com.wiyun.engine.nodes.Layer ) v1 ).scheduleOnce ( v0, v12 ); // invoke-virtual {v1, v0, v12}, Lcom/wiyun/engine/nodes/Layer;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
	 ay .a ( v0 );
	 return;
} // :cond_0
av .a ( v0 );
/* aput-object v7, v5, v0 */
/* aget-object v7, v2, v0 */
/* iget v7, v7, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* aget-object v8, v2, v0 */
/* iget v8, v8, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* aget-object v9, v3, v0 */
/* iget v9, v9, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* aget-object v10, v3, v0 */
/* iget v10, v10, Lcom/wiyun/engine/types/WYPoint;->y:F */
com.wiyun.engine.actions.MoveTo .make ( v12,v7,v8,v9,v10 );
/* aput-object v7, v6, v0 */
/* aget-object v7, v6, v0 */
(( com.wiyun.engine.actions.MoveTo ) v7 ).autoRelease ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/actions/MoveTo;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
v7 = this.layer_parent;
/* aget-object v8, v5, v0 */
/* iget v9, p0, Llqh/china/lianliankancgrbw/PubParticleManager;->zOrder:I */
(( com.wiyun.engine.nodes.Layer ) v7 ).addChild ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Lcom/wiyun/engine/nodes/Layer;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
/* aget-object v7, v5, v0 */
/* aget-object v8, v6, v0 */
(( com.wiyun.engine.particle.ParticleSystem ) v7 ).runAction ( v8 ); // invoke-virtual {v7, v8}, Lcom/wiyun/engine/particle/ParticleSystem;->runAction(Lcom/wiyun/engine/actions/Action;)V
/* aget-object v7, v5, v0 */
(( com.wiyun.engine.particle.ParticleSystem ) v7 ).autoRelease ( ); // invoke-virtual {v7}, Lcom/wiyun/engine/particle/ParticleSystem;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void of_play_particle_fireup ( Float p0, Float p1 ) {
/* .locals 0 */
(( lqh.china.lianliankancgrbw.PubParticleManager ) p0 ).of_play_particle_fireup ( p2 ); // invoke-virtual {p0, p2}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_fireup(F)V
return;
} // .end method
public void of_play_particle_firework ( Float p0, Float p1, Integer p2 ) {
/* .locals 8 */
int v7 = 4; // const/4 v7, 0x4
v0 = this.array_wp;
/* if-nez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* if-ltz p3, :cond_0 */
v0 = this.array_wp;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge p3, v0, :cond_0 */
/* new-array v2, v7, [I */
/* fill-array-data v2, :array_0 */
v0 = this.array_wp;
(( java.util.ArrayList ) v0 ).get ( p3 ); // invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, [Lcom/wiyun/engine/types/WYPoint; */
/* new-array v3, v7, [Lcom/wiyun/engine/particle/ParticleSystem; */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-lt v1, v7, :cond_2 */
ay .a ( v0 );
} // :cond_2
/* aget v4, v2, v1 */
com.wiyun.engine.particle.ParticleLoader .load ( v4 );
/* aput-object v4, v3, v1 */
/* const v4, 0x7f020069 */
com.wiyun.engine.opengl.Texture2D .make ( v4 );
/* aget-object v5, v3, v1 */
(( com.wiyun.engine.particle.ParticleSystem ) v5 ).setTexture ( v4 ); // invoke-virtual {v5, v4}, Lcom/wiyun/engine/particle/ParticleSystem;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
/* aget-object v4, v3, v1 */
/* aget-object v5, v0, v1 */
(( com.wiyun.engine.particle.ParticleSystem ) v4 ).setPosition ( v5 ); // invoke-virtual {v4, v5}, Lcom/wiyun/engine/particle/ParticleSystem;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
v4 = this.layer_parent;
/* aget-object v5, v3, v1 */
/* iget v6, p0, Llqh/china/lianliankancgrbw/PubParticleManager;->zOrder:I */
(( com.wiyun.engine.nodes.Layer ) v4 ).addChild ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/wiyun/engine/nodes/Layer;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
/* aget-object v4, v3, v1 */
(( com.wiyun.engine.particle.ParticleSystem ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/particle/ParticleSystem;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* add-int/lit8 v1, v1, 0x1 */
/* :array_0 */
/* .array-data 4 */
/* 0x7f040011 */
/* 0x7f040012 */
/* 0x7f040013 */
/* 0x7f040014 */
} // .end array-data
} // .end method
public void of_play_particle_starlight ( Float p0, Float p1 ) {
/* .locals 2 */
au .a ( );
(( com.wiyun.engine.particle.ParticleSystem ) v0 ).setPosition ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/wiyun/engine/particle/ParticleSystem;->setPosition(FF)V
v1 = this.layer_parent;
(( com.wiyun.engine.nodes.Layer ) v1 ).addChild ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Layer;->addChild(Lcom/wiyun/engine/nodes/Node;)V
return;
} // .end method
public void of_play_particle_starlight ( Integer p0 ) {
/* .locals 10 */
/* const/high16 v9, 0x42200000 # 40.0f */
/* const-wide/high16 v7, 0x4034000000000000L # 20.0 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, p1, :cond_0 */
return;
} // :cond_0
java.lang.Math .random ( );
/* move-result-wide v2 */
/* iget v4, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* sub-float/2addr v4, v9 */
/* float-to-double v4, v4 */
/* mul-double/2addr v2, v4 */
/* add-double/2addr v2, v7 */
/* double-to-float v2, v2 */
java.lang.Math .random ( );
/* move-result-wide v3 */
/* iget v5, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* sub-float/2addr v5, v9 */
/* float-to-double v5, v5 */
/* mul-double/2addr v3, v5 */
/* add-double/2addr v3, v7 */
/* double-to-float v3, v3 */
(( lqh.china.lianliankancgrbw.PubParticleManager ) p0 ).of_play_particle_starlight ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Llqh/china/lianliankancgrbw/PubParticleManager;->of_play_particle_starlight(FF)V
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
