public class lqh.china.lianliankancgrbw.PubLayer extends com.wiyun.engine.nodes.Layer {
	 /* # instance fields */
	 Integer ii_tag_last;
	 lqh.china.lianliankancgrbw.PubParticleManager particle_manager;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.PubLayer ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* const/16 v0, 0x2710 */
		 /* iput v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
		 /* new-instance v0, Llqh/china/lianliankancgrbw/PubParticleManager; */
		 /* const/16 v1, 0x9 */
		 /* invoke-direct {v0, p0, v1}, Llqh/china/lianliankancgrbw/PubParticleManager;-><init>(Lcom/wiyun/engine/nodes/Layer;I)V */
		 this.particle_manager = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 Float DP ( Float p0 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( p1 );
	 } // .end method
	 Float SP ( Float p0 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveSp ( p1 );
	 } // .end method
	 public com.wiyun.engine.nodes.Sprite of_create_label_sprite ( com.wiyun.engine.types.WYRect p0, Integer p1 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( lqh.china.lianliankancgrbw.PubLayer ) p0 ).of_create_label_sprite ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Llqh/china/lianliankancgrbw/PubLayer;->of_create_label_sprite(Lcom/wiyun/engine/types/WYRect;II)Lcom/wiyun/engine/nodes/Sprite;
	 } // .end method
	 public com.wiyun.engine.nodes.Sprite of_create_label_sprite ( com.wiyun.engine.types.WYRect p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 com.wiyun.engine.nodes.Sprite .make ( p2 );
		 v1 = 		 (( com.wiyun.engine.types.WYRect ) p1 ).midX ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->midX()F
		 v2 = 		 (( com.wiyun.engine.types.WYRect ) p1 ).midY ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->midY()F
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 v1 = this.size;
		 /* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
		 v2 = this.size;
		 /* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setContentSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
		 int v1 = 1; // const/4 v1, 0x1
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).setAutoFit ( v1 ); // invoke-virtual {v0, v1}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
		 (( lqh.china.lianliankancgrbw.PubLayer ) p0 ).addChild ( v0, p3 ); // invoke-virtual {p0, v0, p3}, Llqh/china/lianliankancgrbw/PubLayer;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
		 (( com.wiyun.engine.nodes.Sprite ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
	 } // .end method
	 public com.wiyun.engine.particle.ParticleSystem of_get_particle_explorsion ( Integer p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 1 */
		 /* const v0, 0x7f02005e */
		 com.wiyun.engine.opengl.Texture2D .make ( v0 );
		 (( lqh.china.lianliankancgrbw.PubLayer ) p0 ).of_get_particle_explorsion ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Llqh/china/lianliankancgrbw/PubLayer;->of_get_particle_explorsion(ILcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/opengl/Texture2D;)Lcom/wiyun/engine/particle/ParticleSystem;
	 } // .end method
	 public com.wiyun.engine.particle.ParticleSystem of_get_particle_explorsion ( Integer p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.opengl.Texture2D p2 ) {
		 /* .locals 9 */
		 /* const v0, 0x7f04000c */
		 com.wiyun.engine.particle.ParticleLoader .load ( v0 );
		 (( com.wiyun.engine.particle.QuadParticleSystem ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/particle/QuadParticleSystem;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* check-cast v0, Lcom/wiyun/engine/particle/ParticleSystem; */
		 (( com.wiyun.engine.particle.ParticleSystem ) v0 ).setPosition ( p2 ); // invoke-virtual {v0, p2}, Lcom/wiyun/engine/particle/ParticleSystem;->setPosition(Lcom/wiyun/engine/types/WYPoint;)V
		 (( com.wiyun.engine.particle.ParticleSystem ) v0 ).setTexture ( p3 ); // invoke-virtual {v0, p3}, Lcom/wiyun/engine/particle/ParticleSystem;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;)V
		 /* packed-switch p1, :pswitch_data_0 */
	 } // :goto_0
	 /* :pswitch_0 */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/high16 v3, 0x3f800000 # 1.0f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setStartColorVariance(FFFFFFFF)V */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/high16 v3, 0x3f800000 # 1.0f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setEndColorVariance(FFFFFFFF)V */
	 /* :pswitch_1 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setStartColorVariance(FFFFFFFF)V */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setEndColorVariance(FFFFFFFF)V */
	 /* :pswitch_2 */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setStartColorVariance(FFFFFFFF)V */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setEndColorVariance(FFFFFFFF)V */
	 /* :pswitch_3 */
	 /* const v1, 0x3f77f62b # 0.9686f */
	 /* const v2, 0x3e54c986 # 0.2078f */
	 /* const v3, 0x3efcfaad # 0.4941f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setStartColorVariance(FFFFFFFF)V */
	 /* const v1, 0x3f77f62b # 0.9686f */
	 /* const v2, 0x3e54c986 # 0.2078f */
	 /* const v3, 0x3efcfaad # 0.4941f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setEndColorVariance(FFFFFFFF)V */
	 /* goto/16 :goto_0 */
	 /* :pswitch_4 */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/high16 v3, 0x3f800000 # 1.0f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setStartColorVariance(FFFFFFFF)V */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 int v2 = 0; // const/4 v2, 0x0
	 /* const/high16 v3, 0x3f800000 # 1.0f */
	 /* const v4, 0x3f333333 # 0.7f */
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const v7, 0x3dcccccd # 0.1f */
	 /* const v8, 0x3dcccccd # 0.1f */
	 /* invoke-virtual/range {v0 ..v8}, Lcom/wiyun/engine/particle/ParticleSystem;->setEndColorVariance(FFFFFFFF)V */
	 /* goto/16 :goto_0 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
	 /* :pswitch_4 */
} // .end packed-switch
} // .end method
public Integer of_get_tag ( ) {
/* .locals 2 */
/* iget v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
/* iget v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
/* const v1, 0x7fffffff */
/* if-lt v0, v1, :cond_0 */
/* const/16 v0, 0x2710 */
/* iput v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
} // :cond_0
/* iget v0, p0, Llqh/china/lianliankancgrbw/PubLayer;->ii_tag_last:I */
} // .end method
public void of_remove_by_tag ( Float p0, Integer p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( lqh.china.lianliankancgrbw.PubLayer ) p0 ).removeChild ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Llqh/china/lianliankancgrbw/PubLayer;->removeChild(IZ)V
return;
} // .end method
public void of_remove_by_time ( Float p0, Integer p1 ) {
/* .locals 5 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
final String v1 = "of_remove_by_tag(float,int)"; // const-string v1, "of_remove_by_tag(float,int)"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
java.lang.Float .valueOf ( v4 );
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
java.lang.Integer .valueOf ( p2 );
/* aput-object v4, v2, v3 */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
(( lqh.china.lianliankancgrbw.PubLayer ) p0 ).scheduleOnce ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Llqh/china/lianliankancgrbw/PubLayer;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
return;
} // .end method
