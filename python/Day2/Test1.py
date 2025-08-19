import unittest
from Task1 import yearsUntilDoubleAge

class TestYearsUntilDoubleAge(unittest.TestCase):

	def test_exact_double_in_future(self):
		self.assertEqual(yearsUntilDoubleAge(27, 7), 13)

	def test_already_double(self):
		self.assertEqual(yearsUntilDoubleAge(40, 20), 0)

	def test_never_double(self):
		self.assertEqual(yearsUntilDoubleAge(10, 10), "It will never happen within a reasonable time.")

	def test_negative_ages(self):
		self.assertEqual(yearsUntilDoubleAge(-30, -15), 0)

	def test_large_gap(self):
		self.assertEqual(yearsUntilDoubleAge(100, 1), "It will never happen within a reasonable time.")

	def test_edge_case_just_before_limit(self):
		self.assertEqual(yearsUntilDoubleAge(100, 49), 2)

if __name__ == '__main__':
    unittest.main()