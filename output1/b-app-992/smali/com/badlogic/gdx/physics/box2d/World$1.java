class com.badlogic.gdx.physics.box2d.World$1 extends com.badlogic.gdx.utils.Pool {
	 /* # instance fields */
	 final com.badlogic.gdx.physics.box2d.World this$0; //synthetic
	 /* # direct methods */
	 com.badlogic.gdx.physics.box2d.World$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0, p2, p3}, Lcom/badlogic/gdx/utils/Pool;-><init>(II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected com.badlogic.gdx.physics.box2d.Body newObject ( ) {
		 /* .locals 4 */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Body; */
		 v1 = this.this$0;
		 /* const-wide/16 v2, 0x0 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/Body;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
	 } // .end method
	 protected java.lang.Object newObject ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( com.badlogic.gdx.physics.box2d.World$1 ) p0 ).newObject ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/World$1;->newObject()Lcom/badlogic/gdx/physics/box2d/Body;
	 } // .end method
