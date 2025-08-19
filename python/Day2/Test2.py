import unittest
from Task2 import totalGrade

class TestTotalGrade(unittest.TestCase):

	def test_grade_A(self):
		self.assertEqual(totalGrade(95, 90, 100), "A")

	def test_grade_B(self):
		self.assertEqual(totalGrade(85, 80, 89), "B")

	def test_grade_C(self):
		self.assertEqual(totalGrade(70, 75, 79), "C")

	def test_grade_D(self):
		self.assertEqual(totalGrade(60, 65, 69), "D")

	def test_grade_F(self):
		self.assertEqual(totalGrade(50, 55, 59), "F")

	def test_invalid_score_negative(self):
		self.assertEqual(totalGrade(-10, 50, 60), "Invalid score")

	def test_invalid_score_above_100(self):
		self.assertEqual(totalGrade(110, 90, 95), "Invalid score")

	def test_boundary_A(self):
		self.assertEqual(totalGrade(90, 90, 90), "A")

	def test_boundary_F(self):
		self.assertEqual(totalGrade(0, 0, 0), "F")

if __name__ == '__main__':
    unittest.main()