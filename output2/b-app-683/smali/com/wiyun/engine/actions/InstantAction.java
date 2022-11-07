public abstract class com.wiyun.engine.actions.InstantAction extends com.wiyun.engine.actions.FiniteTimeAction {
	 /* .source "InstantAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.InstantAction ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 /* const v0, 0x3a83126f # 0.001f */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/FiniteTimeAction;-><init>(F)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.InstantAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/FiniteTimeAction;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.actions.Action copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->copy()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public abstract com.wiyun.engine.actions.InstantAction copy ( ) {
	 } // .end method
	 public java.lang.Object copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->copy()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public Boolean isDone ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public com.wiyun.engine.actions.Action reverse ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.InstantAction ) p0 ).reverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/InstantAction;->reverse()Lcom/wiyun/engine/actions/InstantAction;
	 } // .end method
	 public abstract com.wiyun.engine.actions.InstantAction reverse ( ) {
	 } // .end method
	 public void step ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "delta" # F */
		 /* .prologue */
		 /* .line 30 */
		 return;
	 } // .end method
	 public void update ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "input" # F */
		 /* .prologue */
		 /* .line 35 */
		 return;
	 } // .end method
