public class lqh.china.lianliankancgrbw.SameStarActivity extends lqh.china.lianliankancgrbw.PubWiEngineActivity {
	 /* # instance fields */
	 at g;
	 /* # direct methods */
	 public lqh.china.lianliankancgrbw.SameStarActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Llqh/china/lianliankancgrbw/PubWiEngineActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected com.wiyun.engine.nodes.Layer createLayer ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lat; */
		 /* invoke-direct {v0, p0}, Lat;-><init>(Landroid/app/Activity;)V */
		 this.g = v0;
		 v0 = this.g;
		 v1 = this.ad;
		 this.b = v1;
		 /* new-instance v0, Llqh/china/lianliankancgrbw/PubLayerSplash; */
		 /* invoke-direct {v0, p0}, Llqh/china/lianliankancgrbw/PubLayerSplash;-><init>(Landroid/app/Activity;)V */
	 } // .end method
	 public void of_openMainLayer ( Float p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 com.wiyun.engine.nodes.Scene .make ( );
		 /* new-instance v1, Llqh/china/lianliankancgrbw/LayerMain; */
		 v2 = this.g;
		 /* invoke-direct {v1, v2}, Llqh/china/lianliankancgrbw/LayerMain;-><init>(Lat;)V */
		 (( lqh.china.lianliankancgrbw.LayerMain ) v1 ).autoRelease ( v3 ); // invoke-virtual {v1, v3}, Llqh/china/lianliankancgrbw/LayerMain;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
		 int v2 = 0; // const/4 v2, 0x0
		 (( com.wiyun.engine.nodes.Scene ) v0 ).addChild ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/wiyun/engine/nodes/Scene;->addChild(Lcom/wiyun/engine/nodes/Node;I)V
		 (( com.wiyun.engine.nodes.Scene ) v0 ).autoRelease ( v3 ); // invoke-virtual {v0, v3}, Lcom/wiyun/engine/nodes/Scene;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node;
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 com.wiyun.engine.transitions.CrossFadeTransition .make ( v1,v0 );
		 (( com.wiyun.engine.transitions.CrossFadeTransition ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/transitions/CrossFadeTransition;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* check-cast v0, Lcom/wiyun/engine/transitions/TransitionScene; */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v1 ).replaceScene ( v0 ); // invoke-virtual {v1, v0}, Lcom/wiyun/engine/nodes/Director;->replaceScene(Lcom/wiyun/engine/nodes/Scene;)V
		 return;
	 } // .end method
	 public void onDirectorPaused ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onDirectorResumed ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
