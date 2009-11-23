trait Observer[S] {
  def notify(changee: S)
}

trait Subject[S] { this: S =>
  private var observers: List[Observer[S]] = Nil
  def addObserver(o: Observer[S]) { observers = o :: observers }
  def changed { observers.foreach(_.notify(this)) }
}

class Screen {
  def update(l: Line) { println("Update: " + l) }
}

class Line(var x1: Int, var y1: Int, var x2: Int, var y2: Int) {
  def setStart(x: Int, y: Int) { x1 = x; y1 = y }
  def setEnd(x: Int, y: Int) { x2 = x; y2 = y }
  override def toString = x1 + "," + y1 + ":" + x2 + "," + y2
}

object ObserverPattern extends Application {
  class LineSubject(x1: Int, y1: Int, x2: Int, y2: Int) extends Line(x1, y1, x2, y2) with Subject[Line] {
    override def setStart(x: Int, y: Int) {
      super.setStart(x, y)
      changed
    }
    override def setEnd(x: Int, y: Int) {
      super.setEnd(x, y)
      changed
    }
  }
  class ScreenObserver extends Screen with Observer[Line] {
    def notify(l: Line) { update(l) }
  }

  val screen = new ScreenObserver
  val line1 = new LineSubject(1, 2, 4, 5)
  line1.addObserver(screen)
  val line2 = new LineSubject(2, 3, 5, 3)
  line2.addObserver(screen)

  line1.setStart(10, 9)
  line2.setEnd(4, 5)
}
