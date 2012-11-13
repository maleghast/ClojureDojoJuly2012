(ns maze.four
  (:use [maze www draw gen play] ))

(defn solver
  [[n-dist _ _] [e-dist _ _] [s-dist _ _] [w-dist _ _] path]
  (let [dirs {:n n-dist :e e-dist :s s-dist :w w-dist}
        last-step (last path)])

  )
