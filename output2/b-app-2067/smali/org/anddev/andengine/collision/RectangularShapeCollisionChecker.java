public class org.anddev.andengine.collision.RectangularShapeCollisionChecker extends org.anddev.andengine.collision.ShapeCollisionChecker {
	 /* # static fields */
	 private static final Integer LINE_VERTEX_COUNT;
	 private static final Integer RECTANGULARSHAPE_VERTEX_COUNT;
	 private static final VERTICES_COLLISION_TMP_A;
	 private static final VERTICES_COLLISION_TMP_B;
	 private static final VERTICES_CONTAINS_TMP;
	 /* # direct methods */
	 static org.anddev.andengine.collision.RectangularShapeCollisionChecker ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x8 */
		 /* new-array v0, v1, [F */
		 /* new-array v0, v1, [F */
		 /* new-array v0, v1, [F */
		 return;
	 } // .end method
	 public org.anddev.andengine.collision.RectangularShapeCollisionChecker ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/collision/ShapeCollisionChecker;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean checkCollision ( org.anddev.andengine.entity.shape.RectangularShape p0, org.anddev.andengine.entity.primitive.Line p1 ) {
		 /* .locals 4 */
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p0,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 org.anddev.andengine.collision.LineCollisionChecker .fillVertices ( p1,v0 );
		 /* const/16 v0, 0x8 */
		 v1 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 int v2 = 4; // const/4 v2, 0x4
		 v3 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 v0 = 		 org.anddev.andengine.collision.ShapeCollisionChecker .checkCollision ( v0,v1,v2,v3 );
	 } // .end method
	 public static Boolean checkCollision ( org.anddev.andengine.entity.shape.RectangularShape p0, org.anddev.andengine.entity.shape.RectangularShape p1 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x8 */
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p0,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p1,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 v1 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 v0 = 		 org.anddev.andengine.collision.ShapeCollisionChecker .checkCollision ( v2,v0,v2,v1 );
	 } // .end method
	 public static Boolean checkContains ( org.anddev.andengine.entity.shape.RectangularShape p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_CONTAINS_TMP;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p0,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_CONTAINS_TMP;
		 /* const/16 v1, 0x8 */
		 v0 = 		 org.anddev.andengine.collision.ShapeCollisionChecker .checkContains ( v0,v1,p1,p2 );
	 } // .end method
	 private static void fillVertices ( org.anddev.andengine.engine.camera.Camera p0, Float[] p1 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
		 /* aput v1, p1, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
		 /* aput v1, p1, v0 */
		 int v0 = 2; // const/4 v0, 0x2
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxX()F
		 /* aput v1, p1, v0 */
		 int v0 = 3; // const/4 v0, 0x3
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
		 /* aput v1, p1, v0 */
		 int v0 = 4; // const/4 v0, 0x4
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxX()F
		 /* aput v1, p1, v0 */
		 int v0 = 5; // const/4 v0, 0x5
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxY()F
		 /* aput v1, p1, v0 */
		 int v0 = 6; // const/4 v0, 0x6
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
		 /* aput v1, p1, v0 */
		 int v0 = 7; // const/4 v0, 0x7
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxY()F
		 /* aput v1, p1, v0 */
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getRotation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getRotation()F
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
		 v2 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
		 org.anddev.andengine.util.MathUtils .rotateAroundCenter ( p1,v0,v1,v2 );
		 return;
	 } // .end method
	 public static void fillVertices ( org.anddev.andengine.entity.shape.RectangularShape p0, Float[] p1 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = 		 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getWidth()F
		 v1 = 		 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getHeight()F
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput v3, p1, v2 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v3, p1, v2 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v0, p1, v2 */
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v3, p1, v2 */
		 int v2 = 4; // const/4 v2, 0x4
		 /* aput v0, p1, v2 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* aput v1, p1, v0 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* aput v3, p1, v0 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* aput v1, p1, v0 */
		 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getLocalToSceneTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getLocalToSceneTransformation()Lorg/anddev/andengine/util/Transformation;
		 (( org.anddev.andengine.util.Transformation ) v0 ).transform ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
		 return;
	 } // .end method
	 public static Boolean isVisible ( org.anddev.andengine.engine.camera.Camera p0, org.anddev.andengine.entity.primitive.Line p1 ) {
		 /* .locals 4 */
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p0,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 org.anddev.andengine.collision.LineCollisionChecker .fillVertices ( p1,v0 );
		 /* const/16 v0, 0x8 */
		 v1 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 int v2 = 4; // const/4 v2, 0x4
		 v3 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 v0 = 		 org.anddev.andengine.collision.ShapeCollisionChecker .checkCollision ( v0,v1,v2,v3 );
	 } // .end method
	 public static Boolean isVisible ( org.anddev.andengine.engine.camera.Camera p0, org.anddev.andengine.entity.shape.RectangularShape p1 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x8 */
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p0,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( p1,v0 );
		 v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_A;
		 v1 = org.anddev.andengine.collision.RectangularShapeCollisionChecker.VERTICES_COLLISION_TMP_B;
		 v0 = 		 org.anddev.andengine.collision.ShapeCollisionChecker .checkCollision ( v2,v0,v2,v1 );
	 } // .end method
