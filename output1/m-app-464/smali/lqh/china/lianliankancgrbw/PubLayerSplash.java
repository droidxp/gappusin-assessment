public class lqh.china.lianliankancgrbw.PubLayerSplash extends com.wiyun.engine.nodes.Layer {
	 /* # instance fields */
	 android.app.Activity main_activity;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.PubLayerSplash ( ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 int v6 = 1; // const/4 v6, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 this.main_activity = p1;
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getWindowSize ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getWindowSize()Lcom/wiyun/engine/types/WYSize;
		 /* const v1, 0x7f020002 */
		 com.wiyun.engine.nodes.Sprite .make ( v1 );
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAnchor ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setAnchor(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setPosition ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lcom/wiyun/engine/nodes/Sprite;->setPosition(FF)V
		 /* iget v2, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setContentSize ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/wiyun/engine/nodes/Sprite;->setContentSize(FF)V
		 (( com.wiyun.engine.nodes.Sprite ) v1 ).setAutoFit ( v6 ); // invoke-virtual {v1, v6}, Lcom/wiyun/engine/nodes/Sprite;->setAutoFit(Z)V
		 (( lqh.china.lianliankancgrbw.PubLayerSplash ) p0 ).addChild ( v1 ); // invoke-virtual {p0, v1}, Llqh/china/lianliankancgrbw/PubLayerSplash;->addChild(Lcom/wiyun/engine/nodes/Node;)V
		 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
		 v1 = this.main_activity;
		 final String v2 = "of_openMainLayer(float)"; // const-string v2, "of_openMainLayer(float)"
		 /* new-array v3, v6, [Ljava/lang/Object; */
		 java.lang.Float .valueOf ( v5 );
		 /* aput-object v4, v3, v7 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 (( lqh.china.lianliankancgrbw.PubLayerSplash ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/PubLayerSplash;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
		 /* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
		 final String v1 = "of_load_sound(float)"; // const-string v1, "of_load_sound(float)"
		 /* new-array v2, v6, [Ljava/lang/Object; */
		 java.lang.Float .valueOf ( v5 );
		 /* aput-object v3, v2, v7 */
		 /* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
		 /* const v1, 0x3dcccccd # 0.1f */
		 (( lqh.china.lianliankancgrbw.PubLayerSplash ) p0 ).scheduleOnce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Llqh/china/lianliankancgrbw/PubLayerSplash;->scheduleOnce(Lcom/wiyun/engine/utils/TargetSelector;F)V
		 return;
	 } // .end method
	 public static void of_load_sound_effect ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void of_load_sound ( Float p0 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 ay .b ( v0 );
		 return;
	 } // .end method
