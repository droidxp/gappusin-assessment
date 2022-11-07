public abstract class com.wiyun.engine.actions.InstantAction extends com.wiyun.engine.actions.FiniteTimeAction {
	 /* # direct methods */
	 public com.wiyun.engine.actions.InstantAction ( ) {
		 /* .locals 1 */
		 /* const v0, 0x3a83126f # 0.001f */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/FiniteTimeAction;-><init>(F)V */
		 return;
	 } // .end method
	 public com.wiyun.engine.actions.InstantAction ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/FiniteTimeAction;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract com.wiyun.engine.actions.InstantAction a ( ) {
	 } // .end method
	 public abstract com.wiyun.engine.actions.InstantAction b ( ) {
	 } // .end method
	 public com.wiyun.engine.actions.Action copy ( ) { //synthethic
		 /* .locals 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->b()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public java.lang.Object copy ( ) { //synthethic
		 /* .locals 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->b()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public Boolean isDone ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public com.wiyun.engine.actions.Action reverse ( ) { //synthethic
		 /* .locals 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->a()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public void step ( Float p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void update ( Float p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
